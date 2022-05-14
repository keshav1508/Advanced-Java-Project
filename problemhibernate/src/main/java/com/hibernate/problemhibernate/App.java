package com.hibernate.problemhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory yo=new Configuration().configure().buildSessionFactory(); 
        employee emp=new employee();
        emp.setName("k");
        emp.setDept("IT");
        emp.setDesignation("Gamer");
        emp.setManager("amit");
        emp.setSal(100);
        emp.setTax(100);
        emp.setDjoin("12-05-2021");
        Session session=yo.openSession();
        session.beginTransaction();
        session.save(emp);
//        session.getTransaction().commit();
        session.close();
    }
}
