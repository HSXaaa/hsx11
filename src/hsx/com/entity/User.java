package hsx.com.entity;

public class User {

	private Integer id;
	private String username;
	private String portrait;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPortrait() {
		return portrait;
	}
	
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	
	public User() {
		super();
	}
	public User(String username, String portrait) {
		super();
		this.username = username;
		this.portrait = portrait;
	}
}
