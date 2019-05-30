package hsx.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import hsx.com.entity.User;
import hsx.com.service.UserService;
import net.sf.json.JSONObject;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;

	//获取用户名和头像的URL
	@RequestMapping("/nmandpic")
	public void SaveUserInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username=request.getParameter("username");
		String portrait=request.getParameter("portrait");
		System.out.println("success:"+"username:"+username+";"+"portrait:"+portrait);
		User user=new User(username, portrait);	
    try{  	
    	Integer num=userService.judgeusernameset(username);//检查用户名是否存在
    	System.out.println("满足条件的记录的条数："+num);

    	if(num==0) { //用户名不存在，将用户名和头像URL存入到数据库中，然后将用户名编号返回到前端
		userService.nmandpicset(user);		
        Integer infoId1=user.getId();//存储用户名和头像URL时获取用户名编号id,即其他关联表的infoId
        System.out.println("用户名不存在,将用户名和头像URL存入到数据库中，返回用户名编号:"+infoId1); 
        
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("infoId",infoId1);
		out.println(resultJson);
		out.flush();
		out.close();		
    	}else { //用户名存在，将用户名编号返回到前端    	
    	Integer infoId2=userService.getidset(username);		
        System.out.println("用户名存在，返回用户名编号:"+infoId2); 
        
    	response.setContentType("text/html;charset=utf-8");
    	PrintWriter out=response.getWriter();
    	JSONObject resultJson=new JSONObject();
    	resultJson.put("infoId",infoId2);
    	out.println(resultJson);
    	out.flush();
    	out.close();    		
    	}
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
	
	//查看所有用户信息
	@RequestMapping("/read")	
	public void SearchGarbage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ArrayList<User> unamelist=userService.readalluserset();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("result", unamelist);
		out.println(resultJson);
		out.flush();
		out.close();
	}
}
