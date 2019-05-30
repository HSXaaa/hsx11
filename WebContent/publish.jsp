<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>publish</title> 
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery1.42.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Validform_v5.3.2_min.js"></script>

<script language="javascript">
   $(function(){   	
    $("#publish").submit(function(){
    	if($("#infoId").val()==""){	
    		alert("用户名编号不能为空！");
    		return false;
    	}else if($("#publishtext").val()==""){	
    		alert("文本不能为空！");
    		return false;
    	}else{
    		return true;
    	}
    })
  })
</script>

</head>
<body>
  <form action="${pageContext.request.contextPath }/publish/upload.do" method="post" id="publish" enctype="multipart/form-data">
   用户名编号 ： <input type="text" name="infoId" placeholder="用户名编号infoId，eg：1" style="width:200px; height:20px;" id="infoId" value=""/><br/>
	     文本：<input type="text" name="publishtext" placeholder="帖子的文本" style="width:200px; height:20px;" id="publishtext" value=""/><br/>
	     图片：<input type="file" name="file"/><br/>
	  <input type="submit" value="publish"/>
	
  </form>

 
</body>
</html>