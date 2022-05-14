package com.spring.com.StudentPRN.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class StudentDetails {
    @Id
	private int StudentPrn;
	private String name;
	private String Address;
	@Column(name="Phone_Number")
	private String contactno;
	private int currentyear;
	private String fathername;
	private String mothername;
	private double overallcgpa;
	private String stream;
	
	public StudentDetails(String stream) {
		super();
		this.stream = stream;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public StudentDetails(int studentPrn, String name, String address, String contactno, int currentyear,
			String fathername, String mothername, double d) {
		super();
		StudentPrn = studentPrn;
		this.name = name;
		Address = address;
		this.contactno = contactno;
		this.currentyear = currentyear;
		this.fathername = fathername;
		this.mothername = mothername;
		this.overallcgpa = d;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentPrn() {
		return StudentPrn;
	}
	public void setStudentPrn(int studentPrn) {
		StudentPrn = studentPrn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public int getCurrentyear() {
		return currentyear;
	}
	public void setCurrentyear(int currentyear) {
		this.currentyear = currentyear;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public double getOverallcgpa() {
		return overallcgpa;
	}
	public void setOverallcgpa(double overallcgpa) {
		this.overallcgpa = overallcgpa;
	}
	
	
}
