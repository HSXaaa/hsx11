package hsx.com.service;

import java.util.ArrayList;
import hsx.com.entity.GiveLike;

public interface GiveLikeService {

	public int giveLikeset(Integer publishId);

	public ArrayList<GiveLike> giveLikeAmountset(Integer publishId);

	public int amountset(Integer publishId);

	public int deletegivelikeset(Integer publishId);

}
