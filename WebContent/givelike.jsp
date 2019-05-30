<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>givelike</title> 
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery1.42.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Validform_v5.3.2_min.js"></script>

<script language="javascript">
   $(function(){   	
    $("#like").submit(function(){
    	if($("#infoId").val()==""){	
    		alert("用户名编号不能为空！");
    		return false;
    	}else if($("#publishId").val()==""){	
    		alert("帖子编号不能为空！");
    		return false;
    	}else{
    		return true;
    	}
    })
  })
</script>

<script language="javascript">
   $(function(){   	
    $("#amount").submit(function(){
    	if($("#publishId").val()==""){	
    		alert("帖子编号不能为空！");
    		return false;
    	}else{
    		return true;
    	}
    })
  })
</script>
</head>
<body>
  <form action="${pageContext.request.contextPath }/give/like.do" method="post" id="like" enctype="multipart/form-data">
用户名编号：<input type="text" name="infoId" value="" placeholder="用户名编号infoId，eg：1" style="width:200px; height:20px;" id="infoId"/><br/>
帖子编号：<input type="text" name="publishId" value="" placeholder="帖子编号publishId，eg：1" style="width:200px; height:20px;" id="publishId"/><br/>
	  <input type="submit" value="点赞"/>	
  </form>
  <br/>
  <form action="${pageContext.request.contextPath }/give/amount.do" method="post" id="amount" enctype="multipart/form-data">
帖子编号：<input type="text" name="publishId" value="" placeholder="帖子编号publishId，eg：1" style="width:200px; height:20px;" id="publishId"/><br/>
	  <input type="submit" value="点击查看编号为publishId的帖子的点赞数"/>	
  </form> 
</body>
</html>