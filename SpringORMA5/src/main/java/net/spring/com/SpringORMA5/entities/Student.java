package net.spring.com.SpringORMA5.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stud_Data_Final")
public class Student {
	
	@Id
	private int StudentID;
	private String StudentName;
	private String StudentClass;
	public Student(int studentID, String studentName, String studentClass) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentClass = studentClass;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		
		StudentName = studentName;
	}
	public String getStudentClass() {
		return StudentClass;
	}
	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}
	
	
	

}
