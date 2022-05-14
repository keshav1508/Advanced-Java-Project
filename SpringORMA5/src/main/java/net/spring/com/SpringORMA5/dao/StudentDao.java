package net.spring.com.SpringORMA5.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import net.spring.com.SpringORMA5.entities.Student;

public class StudentDao {

	public HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student)
	{
		Integer r=(Integer) this.hibernateTemplate.save(student);
		return r;
		
		// return which record inserted (Primary Key)
	}
	
	//get the single data(object)
	public Student getStudent(int studentID)
	{
		Student student=this.hibernateTemplate.get(Student.class, studentID);
		return student;
	
	}

	
	//get all students(all rows)
	public List<Student> getAllStudents()
	{
		List<Student> students =this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//deleting the data
	@Transactional
	public void deleteStudent(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//updating data
	@Transactional
	public void updateStudent(int studentId,String name,String city)
	{
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		student.setStudentName(name);
		student.setStudentClass(city);
		this.hibernateTemplate.update(student);
	}
//	public void updateStudent(Student student)
//	{
//		this.hibernateTemplate.update(student);
//	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
