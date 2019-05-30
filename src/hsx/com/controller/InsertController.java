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
	
	//����ҳ�˲����������ơ����ʹ������
	@RequestMapping("/garbage")	
	public String SearchGarbage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String category=request.getParameter("category");
		String advise=request.getParameter("advise");	
		System.out.println("����ɹ���"+"�������ƣ�"+name+","+"�������ͣ�"+category+","+"���������"+advise);
		GarbageClass garbageClass=new GarbageClass(name,category,advise);
		searchService.garbageset(garbageClass);
		return "redirect:/insertgbgmsg.jsp?regsuccess=regsuccessful";
	}
		
}

