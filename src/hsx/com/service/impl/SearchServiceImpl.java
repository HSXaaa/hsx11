package hsx.com.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hsx.com.dao.SearchDao;
import hsx.com.entity.GarbageClass;
import hsx.com.service.SearchService;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

	@Resource
	private SearchDao searchDao;

	@Override
	public ArrayList<GarbageClass> searchset(String name) {
		
		return searchDao.searchsetup(name);
	}

	@Override
	public int garbageset(GarbageClass garbageClass) {
		
		return searchDao.garbagesetup(garbageClass);	
	}
		
}
