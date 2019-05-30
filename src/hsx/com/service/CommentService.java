package hsx.com.service;

import java.util.ArrayList;
import hsx.com.entity.Comment;


public interface CommentService {

	public int commentpublishset(Comment com);

	public ArrayList<Comment> readcommentset(Integer infoId);

	public ArrayList<Comment> readallcommentset(Integer publishId);

	public int deletecommentset(Comment deletecom);

	public int deletecomset(Integer publishId);
	
}
