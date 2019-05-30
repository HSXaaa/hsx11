package hsx.com.service.impl;

import java.util.ArrayList;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import hsx.com.dao.UserDao;
import hsx.com.entity.User;
import hsx.com.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;

	@Override
	public Integer judgeusernameset(String username) {
		return userDao.judgeusernamesetup(username);
	}
	
	@Override
	public int nmandpicset(User user) {
		return userDao.nmandpicsetup(user);
	}

	@Override
	public Integer getidset(String username) {
		return userDao.getidsetup(username);
	}

	@Override
	public ArrayList<User> readalluserset() {
		return userDao.readallusersetup();
	}

}
