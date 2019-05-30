package hsx.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hsx.com.entity.Comment;
import hsx.com.service.CommentService;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/read")
public class ReadCommentController{

	@Resource
	private CommentService commentService;
	 
	//按infoId查看评论
	@RequestMapping("/comment")	
	public void readcomment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer infoId=Integer.parseInt(request.getParameter("infoId"));
		System.out.println(infoId);
	try{
		ArrayList<Comment> comm=commentService.readcommentset(infoId);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("comment",comm);
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
	
	//按publishId查看评论
	@RequestMapping("/allcomment")	
	public void readallcomment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer publishId=Integer.parseInt(request.getParameter("publishId"));	
		System.out.println(publishId);
	try{
		ArrayList<Comment> comm=commentService.readallcommentset(publishId);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("comment",comm);
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

