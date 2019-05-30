package hsx.com.service.impl;

import java.util.ArrayList;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import hsx.com.dao.GiveLikeDao;
import hsx.com.entity.GiveLike;
import hsx.com.service.GiveLikeService;


@Service("giveLikeService")
public class GiveLikeServiceImpl implements GiveLikeService{

	@Resource
	private GiveLikeDao giveLikeDao;

	@Override
	public int giveLikeset(Integer publishId) {
		return giveLikeDao.giveLikesetup(publishId);
	}

	@Override
	public ArrayList<GiveLike> giveLikeAmountset(Integer publishId) {
		return giveLikeDao.giveLikeAmountsetup(publishId);
	}

	@Override
	public int amountset(Integer publishId) {
		return giveLikeDao.amountsetup(publishId);
	}

	@Override
	public int deletegivelikeset(Integer publishId) {
		return giveLikeDao.deletegivelikesetup(publishId);
	}

}
