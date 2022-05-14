package net.compa5.app1;
import java.util.*;
import javax.persistence.Query;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HQLDEMO {
	
	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
	{
		 SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 //select
		 Session s=factory.openSession();
		 
		 String SelectQuery="from Student";
		 Query q1=s.createQuery(SelectQuery);
		 
		 // Multiple Records
		 
		 List<Student> lst= ((org.hibernate.query.Query) q1).list();
		 for(Student stud:lst) {
			 System.out.println(stud.getStudid()+" "+stud.getName()+" "+stud.getCity());
		 }
		 
		 // update
		 System.out.println("Enter city");
		 System.out.println("Enter new City");
		 Scanner input=new Scanner(System.in);
		 String str=input.next();
		 String str1=input.next();
		 org.hibernate.Transaction tx= s.beginTransaction();
		 String UpdateQuery="update Student set city=:X where city=:Y";
		
		 
		 Query q2=s.createQuery(UpdateQuery);
		 q2.setParameter("X",str);
		 q2.setParameter("Y",str1);
		 int r=q2.executeUpdate();
		 System.out.println(r+" "+"Record Updated");
		 tx.commit();
		 
		 //Delete
		 

		 // update
	
		 org.hibernate.Transaction tx1= s.beginTransaction();
		 String DeleteQuery="Delete Student where studid='6'";
		
		 
		 Query q3=s.createQuery(DeleteQuery);
		 int r1=q3.executeUpdate();
		 System.out.println(r1+" "+"Record Deleted");
		 tx.commit();
		 
		 
		 
		 
		 
	}

}
