package smse.model;

import java.util.Date;

public class DataGrid {
	
	private String id;
	private String userName;
	private String company;
	private String num;
	private String level;
	private String type;
	private Date date;
	
	public DataGrid() { }
	
	public DataGrid(String id, String userName, String company, String num, String level, String type, Date date) {
		this.id = id;
		this.userName = userName;
		this.company = company;
		this.num = num;
		this.level = level;
		this.type = type;
		this.date = date;
	}
	
	// getter and setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
