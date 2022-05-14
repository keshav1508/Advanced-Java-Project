package net.compa5.app1;



import java.util.Date;
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
        System.out.print(yo);
        //Student table
        Student student =new Student();
        
        //student.setStudid(2);
        student.setName("keshav");
        student.setCity("Jammu");
        
        //Address table
        
        Address ad=new Address();
        ad.setStreetname("Dehuroad");
        ad.setLandmark("MIT_CORNER");
        ad.setPermenant(false);
        ad.setPincode("180002");
        ad.setAddress_gen_date(new Date());
        
        
        Session session=yo.openSession();
        session.beginTransaction();
        session.save(student);
        session.save(ad);
        session.getTransaction().commit();
        session.close();
        
    }
}
