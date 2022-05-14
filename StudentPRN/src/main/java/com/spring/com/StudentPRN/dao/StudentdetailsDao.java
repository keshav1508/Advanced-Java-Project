package com.spring.com.StudentPRN.dao;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.com.StudentPRN.entities.StudentDetails;



public class StudentdetailsDao {

	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(StudentDetails  sd)
	{
	    Integer i=(Integer)this.hibernateTemplate.save(sd);
		//insert
		return i;
	}
	
	
	//get the single data(object)
	public StudentDetails getStudent(int studentID)
	{
		StudentDetails student=this.hibernateTemplate.get(StudentDetails.class, studentID);
		return student;
	
	}
	//get all students(all rows)
	public List<StudentDetails> getAllStudents()
	{
		List<StudentDetails> students =this.hibernateTemplate.loadAll(StudentDetails.class);
		return students;
	}
	
	//deleting the data
	
	@Transactional
	public void deleteStudent(int studentId)
	{
		StudentDetails student=this.hibernateTemplate.get(StudentDetails.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//updating data
	@Transactional
	public void updateStudent(int studentId,String name,String addres,String phh,int currye,String fnn, String mnn, String branchh ,double ovecgpa)
	{
		StudentDetails student=this.hibernateTemplate.get(StudentDetails.class,studentId);
		student.setStudentPrn(studentId);
		student.setName(name);
		student.setAddress(addres);
		student.setContactno(phh);
		student.setCurrentyear(currye);
		student.setFathername(fnn);
		student.setMothername(mnn);
		student.setStream(branchh);
		student.setOverallcgpa(ovecgpa);
	
		this.hibernateTemplate.update(student);
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
