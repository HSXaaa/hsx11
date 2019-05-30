package hsx.com.dao;

import java.util.ArrayList;
import hsx.com.entity.User;

public interface UserDao {

	public Integer judgeusernamesetup(String username);
	
	public int nmandpicsetup(User user);

	public ArrayList<User> getIdsetup(String username);

	public Integer getidsetup(String username);

	public ArrayList<User> readallusersetup();

}
