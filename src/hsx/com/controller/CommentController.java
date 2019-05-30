package hsx.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hsx.com.entity.Comment;
import hsx.com.service.CommentService;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/comment")
public class CommentController{

	@Resource
	private CommentService commentService;
	
	//评论帖子
	@RequestMapping("/pbl")	
	public void commentpbl(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String comment=request.getParameter("comment");
		Integer infoId=Integer.parseInt(request.getParameter("infoId"));
		Integer publishId=Integer.parseInt(request.getParameter("publishId"));	
		Comment com=new Comment(comment, infoId, publishId);
		System.out.println(com);
	try{
		commentService.commentpublishset(com);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("result",1);
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

	//根据用户名编号和帖子编号删除用户对该帖子的评论
	@RequestMapping("/delete")	
	public void deletecomment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer infoId=Integer.parseInt(request.getParameter("infoId"));
		Integer publishId=Integer.parseInt(request.getParameter("publishId"));	
		Comment deletecom=new Comment(null,infoId, publishId);
		System.out.println(deletecom);
	try{
		commentService.deletecommentset(deletecom);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("result",1);
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

