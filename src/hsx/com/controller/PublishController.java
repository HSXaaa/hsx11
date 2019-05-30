package hsx.com.controller;

import java.io.File;
import java.io.PrintWriter;
import java.util.UUID;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import hsx.com.entity.PublishText;
import hsx.com.service.GiveLikeService;
import hsx.com.service.PublishService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/publish")
public class PublishController {
	
	@Resource
	private PublishService publishService;
	
	@Resource
	private GiveLikeService giveLikeService;
	
	//发布帖子：文本和图片;设置文本不可为空,图片可以为空.
	@RequestMapping("/upload")  
    public void upload(PublishText phText,HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{  
	   String publishtext=request.getParameter("publishtext");
	   System.out.println(publishtext);
	   System.out.println(request.getParameter("publishtext"));  
       //保存数据库的路径  
       String sqlPath = null;   
       //定义文件保存的路径  
	   String filePath=request.getServletContext().getRealPath("/");
	   System.out.println(filePath);
       //定义 文件名  
       String filename=null;    
       if(!phText.getFile().isEmpty()){    
           //生成uuid作为文件名称    
           String uuid = UUID.randomUUID().toString().replaceAll("-","");    
           //获得文件类型（可以判断如果不是图片，禁止上传）    
           String contentType=phText.getFile().getContentType();    
           //获得文件后缀名   
           String suffixName=contentType.substring(contentType.indexOf("/")+1);  
           //得到 文件名  
           filename=uuid+"."+suffixName;   
           System.out.println(filename);  
           //文件保存路径  
           phText.getFile().transferTo(new File(filePath+"upload/"+filename)); 
       }  
       //把图片的路径保存至数据库  
       sqlPath = "upload/"+filename;   
       System.out.println(sqlPath);  
       phText.setPublishtext(request.getParameter("publishtext"));
       phText.setInfoId(Integer.parseInt(request.getParameter("infoId")));  
       phText.setImg(sqlPath);  
       try {
       publishService.publishtextset(phText);
       
       Integer publishId=phText.getId();//发布帖子时获取帖子id,即点赞数表和评论表的publishId
       System.out.println(publishId);
       giveLikeService.amountset(publishId);
       
       response.setContentType("text/html;charset=utf-8");
	   PrintWriter out=response.getWriter();
	   JSONObject resultJson=new JSONObject();
	   resultJson.put("publishId",publishId);
	   out.println(resultJson);
	   out.flush();
	   out.close();
	   
	   //网页效果测试
	   //model.addAttribute("phText", phText); 
	   //return "read";
	   
       }catch (Exception e) {
       response.setContentType("text/html;charset=utf-8");
       PrintWriter out=response.getWriter();
       JSONObject resultJson=new JSONObject();
       resultJson.put("result",0);
       out.println(resultJson);
       out.flush();
       out.close(); 
       e.printStackTrace();
	  }       
	}	
}
