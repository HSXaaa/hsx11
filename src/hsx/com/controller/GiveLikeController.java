package hsx.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import hsx.com.entity.GiveLike;
import hsx.com.service.GiveLikeService;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/give")
public class GiveLikeController{

	@Resource
	private GiveLikeService giveLikeService;
	
	//按照publishId对相应的帖子进行点赞，结果返回用户编号和被点赞的帖子
	@RequestMapping("/like")	
	public void GiveLike(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer infoId=Integer.parseInt(request.getParameter("infoId"));		
		Integer publishId=Integer.parseInt(request.getParameter("publishId"));		
	try{
		giveLikeService.giveLikeset(publishId);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("infoId", infoId);
		resultJson.put("publishId", publishId);
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
	
	//按照publishId查看相应的帖子的点赞数量
	@RequestMapping("/amount")	
	public void GiveLikeAmount(HttpServletRequest request, HttpServletResponse response) throws IOException {		
		Integer publishId=Integer.parseInt(request.getParameter("publishId"));

	try{
		ArrayList<GiveLike> giveLike=giveLikeService.giveLikeAmountset(publishId);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("giveLikes", giveLike);
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

