package hsx.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import hsx.com.entity.GarbageClass;
import hsx.com.service.SearchService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/search")
public class SearchController {

	@Resource
	private SearchService searchService;
	
	//输入垃圾名称搜索垃圾类别和处理意见
	@RequestMapping("/garbage")	
	public void SearchGarbage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		System.out.println("垃圾名称："+name);		
		ArrayList<GarbageClass> garbagelist=searchService.searchset(name);
		System.out.println(garbagelist);

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("result", garbagelist);
		out.println(resultJson);
		out.flush();
		out.close();
	}
}

