package hsx.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hsx.com.service.CommentService;
import hsx.com.service.GiveLikeService;
import hsx.com.service.PublishService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/delete")
public class DeletePublishController {
	
	@Resource
	private PublishService publishService;
	
	@Resource
	private GiveLikeService giveLikeService;
	
	@Resource
	private CommentService commentService;
	
	//根据帖子编号(publishId)删除相应的帖子
	@RequestMapping("/publish")	
	public void deletepb(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer publishId=Integer.parseInt(request.getParameter("publishId"));	
	try{
		giveLikeService.deletegivelikeset(publishId);//publish表和givelike、comment表是关联表，要删除publish表的某行记录；
		commentService.deletecomset(publishId);      //得先删除givelike、comment表的相关数据，然后才能删除publish表的某行记录
		publishService.deletepublishset(publishId);
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
