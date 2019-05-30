<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>deletegbgmsg</title> 
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery1.42.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Validform_v5.3.2_min.js"></script>

<script language="javascript">
   $(function(){   	
    $("#deletegbg").submit(function(){
    	if($("#id").val()==""){	
    		alert("垃圾信息编号不能为空！");
    		return false;
    	}else{
    		return true;
    	}
    })
  })
</script>
<script language="javascript"> 
  var regsuccess='<%=request.getParameter("regsuccess")%>' ;
  if(regsuccess=='regsuccessful'){
   alert("删除信息成功");
  } 
</script>
</head>
<body>
  <form action="${pageContext.request.contextPath }/delete/gbg.do" method="post" id="deletegbg" enctype="multipart/form-data">
垃圾信息编号：<input type="text" name="id" value="" placeholder="垃圾信息编号id，eg：1" style="width:200px; height:20px;" id="id"/><br/>
	  <input type="submit" value="删除"/>	
  </form>
</body>
</html>