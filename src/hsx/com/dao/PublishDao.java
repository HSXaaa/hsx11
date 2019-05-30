package hsx.com.dao;

import java.util.ArrayList;

import hsx.com.entity.PublishText;

public interface PublishDao {

	public void publishtextsetup(PublishText phText);

	public ArrayList<PublishText> readpublishsetup(Integer infoId);

	public ArrayList<PublishText> readallpublishsetup();

	public ArrayList<PublishText> readspublishsetup(Integer id);

	public int publishidsetup(String publishtext);

	public int deletepublishsetup(Integer publishId);

}
