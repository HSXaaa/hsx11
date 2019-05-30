<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>searchgarbage</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery1.42.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Validform_v5.3.2_min.js"></script>

<script language="javascript">
   $(function(){   	
    $("#search").submit(function(){
    	if($("#name").val()==""){	
    		alert("垃圾名称不能为空！");
    		return false;
    	}else{
    		return true;
    	}
    })
  })
</script>
</head>
<body>
<form action="${pageContext.request.contextPath }/search/garbage.do" method="post" id="search">
垃圾名称:<input type="text" name="name" placeholder="垃圾名称，eg：金属" style="width:200px; height:20px;" id="name" /><br/>
<input type="submit" value="search" class="btn btn-primary" id="js-btn-login"/>
</form>

</body>
</html>