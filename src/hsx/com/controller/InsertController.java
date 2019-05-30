package hsx.com.controller;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import hsx.com.entity.GarbageClass;
import hsx.com.service.SearchService;

@Controller
@RequestMapping("/insert")
public class InsertController {

	@Resource
	private SearchService searchService;
	
	//在网页端补充垃圾名称、类别和处理意见
	@RequestMapping("/garbage")	
	public String SearchGarbage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String category=request.getParameter("category");
		String advise=request.getParameter("advise");	
		System.out.println("输入成功："+"垃圾名称："+name+","+"垃圾类型："+category+","+"处理意见："+advise);
		GarbageClass garbageClass=new GarbageClass(name,category,advise);
		searchService.garbageset(garbageClass);
		return "redirect:/insertgbgmsg.jsp?regsuccess=regsuccessful";
	}
		
}

