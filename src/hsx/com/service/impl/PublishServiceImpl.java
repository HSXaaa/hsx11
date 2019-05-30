package hsx.com.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import hsx.com.dao.PublishDao;
import hsx.com.entity.PublishText;
import hsx.com.service.PublishService;

@Service("publishService")
public class PublishServiceImpl implements PublishService{

	@Resource
	private PublishDao publishDao;

	@Override
	public void publishtextset(PublishText phText) {
		 publishDao.publishtextsetup(phText);
	}

	@Override
	public ArrayList<PublishText> readpublishset(Integer infoId) {		
		return publishDao.readpublishsetup(infoId);
	}

	@Override
	public ArrayList<PublishText> readallpublishset() {
		return publishDao.readallpublishsetup();
	}

	@Override
	public ArrayList<PublishText> readspublishset(Integer id) {
		return publishDao.readspublishsetup(id);
	}

	@Override
	public int publishidset(String publishtext) {
		return publishDao.publishidsetup(publishtext);
	}

	@Override
	public int deletepublishset(Integer publishId) {
		return publishDao.deletepublishsetup(publishId);
	}	
}
