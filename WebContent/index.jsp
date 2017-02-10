<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<link  rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css"/>
<body>
<%-- <%
response.sendRedirect("demo");
%> --%>

<form action="demo" method="post" enctype="multipart/form-data">
  First name: <input type="file" name="file1"><br>
  Last name: <input type="file" name="file2"><br>
  <input type="submit" value="提交">
</form>


</html>