package hsx.com.dao;

import java.util.ArrayList;
import hsx.com.entity.GiveLike;

public interface GiveLikeDao {

	public int giveLikesetup(Integer publishId);

	public ArrayList<GiveLike> giveLikeAmountsetup(Integer publishId);

	public int amountsetup(Integer publishId);

	public int deletegivelikesetup(Integer publishId);

}
