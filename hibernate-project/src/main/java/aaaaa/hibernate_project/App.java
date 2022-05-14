package aaaaa.hibernate_project;

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
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        student stud=new student();
        stud.setName("keshav");
        stud.setCity("jammu");
        Session s=factory.openSession();
        s.beginTransaction();
        s.save(stud);
        s.getTransaction().commit();
        s.close();
    }
}
