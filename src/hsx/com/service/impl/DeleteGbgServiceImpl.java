package hsx.com.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import hsx.com.dao.DeleteGbgDao;
import hsx.com.service.DeleteGbgService;

@Service("deleteGbgService")
public class DeleteGbgServiceImpl implements DeleteGbgService{

	@Resource
	private DeleteGbgDao deleteGbgDao;
	
	@Override
	public int deletegbgset(Integer id) {
		return deleteGbgDao.deletegbgsetup(id);
	}

}
