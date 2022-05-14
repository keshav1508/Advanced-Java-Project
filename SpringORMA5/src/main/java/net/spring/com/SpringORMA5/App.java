package net.spring.com.SpringORMA5;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import net.spring.com.SpringORMA5.dao.StudentDao;
import net.spring.com.SpringORMA5.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ct=new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentdao=ct.getBean("studentDao", StudentDao.class);
//       Student st=new Student(1,"Keshav","A");
//       int result=studentdao.insert(st);
//       System.out.println("Record inserted with id"+result);
       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       boolean go=true;
       while(go)
       {
           System.out.println("Press 1 for add new student");
           System.out.println("Press 2 display all student");
           System.out.println("Press 3 for get detail of single student");
           System.out.println("Press 4 for delete student");
           System.out.println("Press 5 for update student");
           System.out.println("Press 6 for exit");
           try {
        	 int input= Integer.parseInt(br.readLine());
//        	 if(input==1)
//        	 {
//        		 //add a new student
//        	 }
//        	 else if(input==2)
//        	 {
//        		 //display
//        	 }
        	 switch (input) {
			 case 1:
		     //add a new student
		     // taking inputs from users		 
			 System.out.println("Enter the id : ");
			 int uId=Integer.parseInt(br.readLine());
			 System.out.println("Enter the name : ");
			 String uName =br.readLine();
			 System.out.println("Enter the city : ");
			 String uCity =br.readLine();
			 // creating student object and setting values
			 Student s=new Student();
			 s.setStudentID(uId);
			 s.setStudentName(uName);
			 s.setStudentClass(uCity);
			 
			 
			 //saving student object to database by calling insert of student dao
			 int r=studentdao.insert(s);
			 System.out.println("ID "+ r+" student added");
			 System.out.println("**************************************");
			 
			 break;
			 case 2:
				  //display all student	
				 System.out.println("************************************************");
				 List<Student> allStudents=studentdao.getAllStudents();
				 for(Student st:allStudents)
				 {
					 System.out.println("ID : " +st.getStudentID());
					 System.out.println("Name : " +st.getStudentName());
					 System.out.println("Class : " +st.getStudentClass());
					 System.out.println("_______________________________________");
				 }
				 System.out.println("************************************************"); 
			 break;
			 case 3:
				  //get single student data	
				 System.out.println("Enter the id : ");
				 int userId=Integer.parseInt(br.readLine());
				 Student student=studentdao.getStudent(userId);
				 System.out.println("ID : " +student.getStudentID());
				 System.out.println("Name : " +student.getStudentName());
				 System.out.println("Class : " +student.getStudentClass());
				 System.out.println("_______________________________________");  
			 break;
			 case 4:
				  //delete student	
				 System.out.println("Enter the id : ");
				 int delId=Integer.parseInt(br.readLine());
				 studentdao.deleteStudent(delId);
				 System.out.println("Student deleted........");
			 break;
			 case 5:
				  //update student	
				 System.out.println("Enter the id : ");
				 int upId=Integer.parseInt(br.readLine());
				 Student student1=studentdao.getStudent(upId);
				 System.out.println("ID : " +student1.getStudentID());
				 System.out.println("Name : " +student1.getStudentName());
				 System.out.println("Class : " +student1.getStudentClass());
				 System.out.println("Enter the name : ");
				 String Name =br.readLine();
				 System.out.println("Enter the city : ");
				 String Class =br.readLine();
				 studentdao.updateStudent(upId,Name,Class);
				 break;
			 case 6:
				  //exit
				 go=false;
				 break;
			default:
				break;
			}
        	   
        	   
        	   
        	   
           } catch(Exception e)
           {
        	   System.out.println("Invalid Input try with another one !!");
        	   System.out.println(e.getMessage());
           }
       }
       System.out.println("thankyou using my application");
}
}
