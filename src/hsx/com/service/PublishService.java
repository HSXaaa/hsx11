package hsx.com.service;

import java.util.ArrayList;

import hsx.com.entity.PublishText;

public interface PublishService {

	public void publishtextset(PublishText phText);

	public ArrayList<PublishText> readpublishset(Integer infoId);

	public ArrayList<PublishText> readallpublishset();

	public ArrayList<PublishText> readspublishset(Integer id);

	public int publishidset(String publishtext);

	public int deletepublishset(Integer publishId);

}
