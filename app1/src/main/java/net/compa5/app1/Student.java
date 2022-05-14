package net.compa5.app1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;






@Entity

class Student {
	@Id  @GeneratedValue
	private int studid;
	private String name;
	private String city;
	
	
	
	public Student(int studid, String name, String city) {
		super();
		this.studid = studid;
		this.name = name;
		this.city = city;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
