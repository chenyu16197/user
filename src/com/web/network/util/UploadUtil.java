package com.web.network.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang.StringUtils;




public class UploadUtil {


    public static UploadFile uploadFile(HttpServletRequest request,String path) {
    	UploadFile uploadFile = new UploadFile();
        File file = new File(path);
        if (!file.exists() && !file.isDirectory()) {
        	file.mkdir();
        }
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setHeaderEncoding("UTF-8");
			if(!ServletFileUpload.isMultipartContent(request)){
			   return null;
			}
			@SuppressWarnings("unchecked")
			List<FileItem> list = upload.parseRequest(request);
			for(FileItem item : list){
				if(!item.isFormField()){
                   String fileName = item.getFieldName();
                   if(StringUtils.isNotEmpty(fileName)){
                	   continue;
                   }
                   fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
                   uploadFile.setFileName(fileName);
                   InputStream in = item.getInputStream();
	               FileOutputStream out = new FileOutputStream(path + "\\" + fileName);
	               byte buffer[] = new byte[1024];
	               int len = 0;
	               while((len=in.read(buffer))>0){
	                   out.write(buffer, 0, len);
	               }
	                in.close();
	                out.close();
	                item.delete();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
        }

    	return uploadFile;
	}

}
