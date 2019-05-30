<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>nmandpic</title> 
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery1.42.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Validform_v5.3.2_min.js"></script>

<script language="javascript">
   $(function(){   	
    $("#reg").submit(function(){
    	if($("#username").val()==""){	
    		alert("用户名不能为空！");
    		return false;
    	}else if($("#portrait").val()==""){	
    		alert("头像URL不能为空！");
    		return false;
    	}else{
    		return true;
    	}
    })
  })
</script>

</head>
<body>

  <form action="${pageContext.request.contextPath }/user/nmandpic.do" method="post" id="reg">
用户名：<input type="text" name="username" placeholder="用户名" style="width:200px; height:20px;" value="" id="username"/><br/>
头像URL：<input type="text" name="portrait" placeholder="头像URL" style="width:200px; height:20px;" value="" id="portrait"><br/>
	<input type="submit" value="reg"/>
  </form>

</body>
</html>