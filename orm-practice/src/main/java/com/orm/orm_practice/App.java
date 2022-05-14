package com.orm.orm_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import orm.student.dao.Studentdoa;
import orm.student.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	 ApplicationContext ct=new ClassPathXmlApplicationContext("config.xml");
         Studentdoa ss=ct.getBean("studentdoa", Studentdoa.class);
//         Student st=new Student(1,"Keshav");
//         int result=ss.insert(st);
//         System.out.println("Record inserted with id"+result);
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          List<Student> mm=ss.getallstudents();
          for(Student st:mm)
          {
        	  System.out.println("id"+st.getSid());
        	  System.out.println("Name"+st.getName());
          }
         
         
      
    }

	private static Reader InputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
}
