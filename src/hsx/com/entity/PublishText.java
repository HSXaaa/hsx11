package hsx.com.entity;

import org.springframework.web.multipart.MultipartFile;

public class PublishText {

	private Integer id;
	private String publishtext;
    private String img;
    private MultipartFile file;
	private Integer infoId;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPublishtext() {
		return publishtext;
	}
	
	public void setPublishtext(String publishtext) {
		this.publishtext = publishtext;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	
	public Integer getInfoId() {
		return infoId;
	}
	
	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	public PublishText() {
		super();
	}
	
	public PublishText(String publishtext, Integer infoId) {
		super();
		this.publishtext = publishtext;
		this.infoId = infoId;
	}

}
