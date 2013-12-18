package org.anshen.test;

import java.lang.reflect.Field;
import java.util.Date;

public class Property {

	private String str;
	private Date date;
	
	// getter and setter
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public static void main(String[] args) {
		Class<Property> pc = Property.class;
		Field[] fields = pc.getDeclaredFields();
		
		for (Field f : fields) {
			System.out.println(f.getType().getSimpleName());
		}
	}
	
}
