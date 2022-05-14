package com.hibernate.problemhibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class employee {
@Id
@GeneratedValue
private int eid;
private String name;
private String dept;
private String designation;
private String manager;
private long sal;
private long tax;
private String djoin;



public employee() {
	super();
	// TODO Auto-generated constructor stub
}
public employee(int eid, String name, String dept, String designation, String manager, long sal, long tax,
		String djoin) {
	super();
	this.eid = eid;
	this.name = name;
	this.dept = dept;
	this.designation = designation;
	this.manager = manager;
	this.sal = sal;
	this.tax = tax;
	this.djoin = djoin;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getManager() {
	return manager;
}
public void setManager(String manager) {
	this.manager = manager;
}
public long getSal() {
	return sal;
}
public void setSal(long sal) {
	this.sal = sal;
}
public long getTax() {
	return tax;
}
public void setTax(long tax) {
	this.tax = tax;
}
public String getDjoin() {
	return djoin;
}
public void setDjoin(String djoin) {
	this.djoin = djoin;
}


}
