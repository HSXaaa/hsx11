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

	//��ȡ�û�����ͷ���URL
	@RequestMapping("/nmandpic")
	public void SaveUserInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username=request.getParameter("username");
		String portrait=request.getParameter("portrait");
		System.out.println("success:"+"username:"+username+";"+"portrait:"+portrait);
		User user=new User(username, portrait);	
    try{  	
    	Integer num=userService.judgeusernameset(username);//����û����Ƿ����
    	System.out.println("���������ļ�¼��������"+num);

    	if(num==0) { //�û��������ڣ����û�����ͷ��URL���뵽���ݿ��У�Ȼ���û�����ŷ��ص�ǰ��
		userService.nmandpicset(user);		
        Integer infoId1=user.getId();//�洢�û�����ͷ��URLʱ��ȡ�û������id,�������������infoId
        System.out.println("�û���������,���û�����ͷ��URL���뵽���ݿ��У������û������:"+infoId1); 
        
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("infoId",infoId1);
		out.println(resultJson);
		out.flush();
		out.close();		
    	}else { //�û������ڣ����û�����ŷ��ص�ǰ��    	
    	Integer infoId2=userService.getidset(username);		
        System.out.println("�û������ڣ������û������:"+infoId2); 
        
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
	
	//�鿴�����û���Ϣ
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
