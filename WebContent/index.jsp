<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>垃圾分类微信小程序后台管理系统</title> 
<link href="${pageContext.request.contextPath }/css/main.d8e0d294.css" rel="stylesheet"/>
</head>
<body>
<main class="content-wrapper">

<header class="white-text-container section-container">
  <div class="text-center">
     <h1>垃圾分类微信小程序后台管理系统</h1>
  </div>
</header>

<div class="container">

  <div class="card">
   <div class="card-block">
    <h2 align="center"><a href="${pageContext.request.contextPath }/search/garbage.do?name=" target="_blank">查看数据库中所有关于垃圾分类处理的信息</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/searchgarbage.jsp" target="_blank">搜索垃圾分类信息</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/insertgbgmsg.jsp" target="_blank">补充垃圾分类的相关数据</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/deletegbgmsg.jsp" target="_blank">删除垃圾分类的相关数据</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/nmandpic.jsp" target="_blank">获取用户登录信息，返回用户名编号infoId</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/user/read.do" target="_blank">查看所有用户信息</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/read/allpublish.do" target="_blank">查看所有用户的帖子，返回结果按降序排序</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/readpublish.jsp" target="_blank">查看某个用户发布的所有帖子，返回结果按降序排序</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/readpublish.jsp" target="_blank">查看指定帖子</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/publish.jsp" target="_blank">用户发布帖子（文本和图片；设置文本不可为空，图片可以为空）</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/comment.jsp" target="_blank">评论帖子</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/readcomment.jsp" target="_blank">按用户名编号(infoId)查看用户评论的所有帖子，返回结果按降序排序</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/readcomment.jsp" target="_blank">按帖子编号(publishId)查看帖子的所有评论，返回结果按降序排序</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/givelike.jsp" target="_blank">对帖子点赞，返回用户名编号和被点赞的帖子编号</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/givelike.jsp" target="_blank">根据帖子编号(publishId)查看该帖子的总点赞数</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/deletecomment.jsp" target="_blank">根据用户名编号和帖子编号删除用户对该帖子的评论</a></h2>
    <h2 align="center"><a href="${pageContext.request.contextPath }/deletepublish.jsp" target="_blank">根据帖子编号(publishId)删除相应的帖子</a></h2>
   </div>
  </div>


</div>

</main>

<footer class="footer-container white-text-container text-center">
  <div class="container">
    <div class="row">
      <div class="col-xs-12">
        <p><small>&copy; Copyright 2018-2019 hsxdy123. All Rights Reserved</small></p>
      </div>
    </div>
  </div>
</footer>
		
<script>
  document.addEventListener("DOMContentLoaded", function (event) {
     scrollRevelation('.card');
  });
</script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/main.bc58148c.js"></script>
</body>
</html>