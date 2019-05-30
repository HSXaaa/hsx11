package hsx.com.service;

import java.util.ArrayList;
import hsx.com.entity.User;

public interface UserService {

	public Integer judgeusernameset(String username);
	
	public int nmandpicset(User user);

	public Integer getidset(String username);

	public ArrayList<User> readalluserset();
	
}
