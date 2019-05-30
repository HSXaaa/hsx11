package hsx.com.controller;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import hsx.com.service.DeleteGbgService;

@Controller
@RequestMapping("/delete")
public class DeleteGarbageController {
	
	@Resource
	private DeleteGbgService deleteGbgService;
	
	//根据垃圾信息编号(id)删除相应的垃圾分类及处理等信息
    @RequestMapping("/gbg")	
	   public String deletegbg(HttpServletRequest request, HttpServletResponse response) throws IOException {
		   Integer id=Integer.parseInt(request.getParameter("id"));	
		   deleteGbgService.deletegbgset(id);
		   return "redirect:/deletegbgmsg.jsp?regsuccess=regsuccessful";
    }	
}
