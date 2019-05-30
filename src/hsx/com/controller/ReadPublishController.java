package hsx.com.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hsx.com.entity.PublishText;
import hsx.com.service.PublishService;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/read")
public class ReadPublishController {
	
	@Resource
	private PublishService publishService;
	
	 //点击查看指定帖子
	 @RequestMapping("/spublish")  
     public void readspublish(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{  
       
	  try{
		  Integer publishId=Integer.parseInt(request.getParameter("publishId"));
		  System.out.println(publishId);
				
		  ArrayList<PublishText> sphText=publishService.readspublishset(publishId);
		  model.addAttribute("phText", sphText);//往前台传数据，可以传对象，可以传List，通过el表达式 ${}可以获取到
		  response.setContentType("text/html;charset=utf-8");
		  PrintWriter out=response.getWriter();
		  JSONObject resultJson=new JSONObject();
		  resultJson.put("result", sphText);
		  out.println(resultJson);
		  out.flush();
		  out.close();		  
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
	
	 //点击查看个人发布的所有帖子
	 @RequestMapping("/infopublish")  
     public void readinfopublish(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{  
       
	  try{
		  Integer infoId=Integer.parseInt(request.getParameter("infoId"));
		  System.out.println(infoId);
				
		  ArrayList<PublishText> phText=publishService.readpublishset(infoId);
		  model.addAttribute("phText", phText);//往前台传数据，可以传对象，可以传List，通过el表达式 ${}可以获取到
		  response.setContentType("text/html;charset=utf-8");
		  PrintWriter out=response.getWriter();
		  JSONObject resultJson=new JSONObject();
		  resultJson.put("result", phText);
		  out.println(resultJson);
		  out.flush();
		  out.close();		  
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
	 
	 //点击查看所有帖子
	 @RequestMapping("/allpublish")  
     public void readall(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{  
       
	  try{
		  ArrayList<PublishText> pht=publishService.readallpublishset();
		  model.addAttribute("phText", pht);//往前台传数据，可以传对象，可以传List，通过el表达式 ${}可以获取到
		  response.setContentType("text/html;charset=utf-8");
		  PrintWriter out=response.getWriter();
		  JSONObject resultJson=new JSONObject();
		  resultJson.put("result", pht);
		  out.println(resultJson);
		  out.flush();
		  out.close();		  
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
