package orm.student.dao;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import orm.student.entities.Student;

public class Studentdoa {
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(Student student)
	{
		Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
		
	}
	
	public Student getbyid(int studid)
	{
	Student stu=this.hibernateTemplate.get( Student.class,studid);
	return stu;
		
	}
	public List<Student> getallstudents()
	{
		List<Student> s=this.hibernateTemplate.loadAll(Student.class);
		return s;
	}
	@Transactional
	public void Update(int studid,String uname)
	{
		Student su=this.hibernateTemplate.get(Student.class, studid);
		su.setName(uname);
		this.hibernateTemplate.update(su);
	}
	@Transactional
	public void Delete(int uid) {
		Student ss=this.hibernateTemplate.get(Student.class, uid);
		this.hibernateTemplate.delete(ss);
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
