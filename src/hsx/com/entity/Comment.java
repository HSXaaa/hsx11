package hsx.com.entity;

public class Comment {

	private Integer id;
	private String comment;
	private Integer infoId;
	private Integer publishId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getInfoId() {
		return infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}
	
	public Integer getPublishId() {
		return publishId;
	}

	public void setPublishId(Integer publishId) {
		this.publishId = publishId;
	}
	
	public Comment() {
		super();
	}

	public Comment(String comment, Integer infoId, Integer publishId) {
		super();
		this.comment = comment;
		this.infoId = infoId;
		this.publishId = publishId;
	}

}
