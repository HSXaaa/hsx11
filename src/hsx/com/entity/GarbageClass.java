package hsx.com.entity;

public class GarbageClass {
	
	private Integer id;
	private String name;
	private String category;
	private String advise;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getAdvise() {
		return advise;
	}

	public void setAdvise(String advise) {
		this.advise = advise;
	}
	
	public GarbageClass() {
		super();
	}
	
	public GarbageClass(String name,String category, String advise) {
		super();
		this.name = name;
		this.category = category;
		this.advise = advise;
	}
}
