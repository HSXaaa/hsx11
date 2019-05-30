<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>insertgbgmsg</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery1.42.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Validform_v5.3.2_min.js"></script>

<script language="javascript">
   $(function(){   	
    $("#insert").submit(function(){
    	if($("#name").val()==""){	
    		alert("垃圾名称不能为空！");
    		return false;
    	}else if($("#category").val()==""){	
    		alert("垃圾类型不能为空！");
    		return false;
    	}else if($("#advise").val()==""){	
    		alert("处理意见不能为空！");
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
   alert("输入信息成功");
  } 
</script>

<style>
#divcss{margin:0 auto;border:0px solid #000;width:600px;height:400px}
</style>
</head>
<body>
<br/><br/><br/>
<div id="divcss">
  <form action="${pageContext.request.contextPath }/insert/garbage.do" method="post" id="insert">
	垃圾名称：<input type="text" name="name" value="" placeholder="垃圾名称，eg：废纸" style="width:200px; height:20px;" id="name"/><br/><br/>
	垃圾类型：<input type="text" name="category" value="" placeholder="垃圾类型，eg：可回收" style="width:200px; height:20px;" id="category"><br/><br/>
	处理意见：<input type="text" name="advise" value="" placeholder="处理意见，eg：投放前应尽量叠放整齐，避免揉团" style="width:500px; height:20px;" id="advise"><br/><br/>
	<input type="submit" value="insert"/>
  </form>
</div>
</body>
</html>