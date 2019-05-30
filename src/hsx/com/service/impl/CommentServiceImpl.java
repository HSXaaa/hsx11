package hsx.com.service.impl;

import java.util.ArrayList;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import hsx.com.dao.CommentDao;
import hsx.com.entity.Comment;
import hsx.com.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Resource
	private CommentDao commentDao;
	
	@Override
	public int commentpublishset(Comment com) {
		return commentDao.commentpublishsetup(com);
	}

	@Override
	public ArrayList<Comment> readcommentset(Integer infoId) {
		return commentDao.readcommentsetup(infoId);
	}

	@Override
	public ArrayList<Comment> readallcommentset(Integer publishId) {
		return commentDao.readallcommentsetup(publishId);
	}

	@Override
	public int deletecommentset(Comment deletecom) {
		return commentDao.deletecommentsetup(deletecom);
	}

	@Override
	public int deletecomset(Integer publishId) {
		return commentDao.deletecomsetup(publishId);
	}
	
}
