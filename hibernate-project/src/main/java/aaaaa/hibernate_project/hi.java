package aaaaa.hibernate_project;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hi {

	public static void main(String[] args) {
	
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		String exquery="from student";
		Query q1=s.createQuery(exquery);
		
		List<student> l1=((org.hibernate.query.Query) q1).list();
		for(student em:l1)
		{
			System.out.println(em.getId()+" "+em.getName()+" "+em.getCity());
		}
       
	}

}
