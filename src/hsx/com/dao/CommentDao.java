package hsx.com.dao;

import java.util.ArrayList;
import hsx.com.entity.Comment;


public interface CommentDao {

	public int commentpublishsetup(Comment com);

	public ArrayList<Comment> readcommentsetup(Integer infoId);

	public ArrayList<Comment> readallcommentsetup(Integer publishId);

	public int deletecommentsetup(Comment deletecom);

	public int deletecomsetup(Integer publishId);

}
