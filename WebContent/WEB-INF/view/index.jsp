﻿<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>jQuery网站后台左侧分类导航菜单</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$(".div2").click(function(){
		$(this).next("div").slideToggle("slow").siblings(".div3:visible").slideUp("slow");
	});
});
</script>

<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
body{font:12px/180% "微软雅黑";}
a,a:hover{color:#000;text-decoration:none;}

.left{width:200px;height:100%;border-right:1px solid #CCCCCC ;#FFFFFF;color:#000000;font-size:14px;text-align:center;position:absolute;left:0;top:0;}
.div1{text-align:center;width:200px;padding-top:10px;}
.div2{height:40px;line-height:40px;cursor:pointer;font-size:13px;position:relative;border-bottom:#ccc 1px dotted;}
.jbsz {position:absolute;height:20px;width:20px;left:40px;top:10px;background:url(images/1.png);}
.xwzx {position:absolute;height:20px;width:20px;left:40px;top:10px;background:url(images/2.png);}
.zxcp {position:absolute;height:20px;width:20px;left:40px;top:10px;background:url(images/4.png);}
.lmtj {position:absolute;height:20px;width:20px;left:40px;top:10px;background:url(images/8.png);}
.div3{display:none;font-size:13px;}
.div3 ul{margin:0;padding:0;}
.div3 li{height:30px;line-height:30px;list-style:none;border-bottom:#ccc 1px dotted;text-align:center;}
</style>

</head>
<body>

<div class="left">
	<div class="div1">
		<div class="left_top"><img src="images/bbb_01.jpg"><img src="images/bbb_02.jpg" id="2"><img src="images/bbb_03.jpg"><img src="images/bbb_04.jpg"></div>

		<div class="div2"><div class="jbsz"></div>基本管理</div>
		<div class="div3">
			<ul>
				<li><a href="#">网站配置</a></li>
				<li><a href="#">管理设置</a></li>
				<li><a href="#">导航菜单</a></li>
			</ul>
		</div>
		<div class="div2"><div class="xwzx"></div>新闻中心</div>
		<div class="div3">
			<ul>
				<li><a href="#">管理文章</a></li>
				<li><a href="#">文章分类</a></li>
				<li><a href="#">添加文章</a></li>
			</ul>
		</div>
		<div class="div2"><div class="zxcp"></div>最新产品</div>
		<div class="div3">
			<ul>
				<li><a href="#">图片管理</a></li>
				<li><a href="#">图片分类</a></li>
				<li><a href="#">添加图片</a></li>
			</ul>
		</div>
		<div class="div2"><div class="lmtj"></div>栏目添加</div>
		<div class="div3">
			<ul>
				<li><a href="#">文章系统</a></li>
				<li><a href="#">图片系统</a></li>
				<li><a href="#">添加表单</a></li>
				<li><a href="#">招聘系统</a></li>
			</ul>
		</div>
	</div>
</div>
<div style="text-align:center;">
<p>来源111:<a href="http://www.mycodes.net/" target="_blank">源码之家</a>
<c:forEach items="${list}" var="item" varStatus="status">
   ${item.id}-${item.name}

</c:forEach>

</p>

</div>


</body>
</html>
