package hsx.com.entity;

public class GiveLike {

	private Integer id;
	private Integer amount;
	private Integer publishId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getPublishId() {
		return publishId;
	}

	public void setPublishId(Integer publishId) {
		this.publishId = publishId;
	}
	
	public GiveLike() {
		super();
	}

	public GiveLike(Integer infoId, Integer publishId) {
		super();
		this.publishId = publishId;
	}

}
