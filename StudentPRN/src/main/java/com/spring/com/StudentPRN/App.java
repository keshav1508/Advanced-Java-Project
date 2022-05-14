package com.spring.com.StudentPRN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.com.StudentPRN.dao.StudentdetailsDao;

import com.spring.com.StudentPRN.entities.StudentDetails;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	ApplicationContext context=  new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentdetailsDao stdo=context.getBean("studentdetailsDao",StudentdetailsDao.class);
//    	StudentDetails stdl=new StudentDetails(1,"keshav","H-no-314","7889624862",3,"attal","renu",9.2);
//    	
//    	int r=stdo.insert(stdl);
//        System.out.println( "Hello World!" );
//        System.out.println( "done"+r );
    	boolean go1=true;
    	while(go1)
		{
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 System.out.println("WELCOME TO MITAOE STUDENT DETAILS SYSTEM");
    	 System.out.println("************************************************");
    	 System.out.println( "1).Admin Login" );
    	 System.out.println( "2).Student Login" );
    	 System.out.println( "3).Exit" );
    	 System.out.println("************************************************");
    	 int input1 = 0;
    	 try {
			input1= Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	 
    	if(input1==1)
    	{
    		boolean go=true;
            while(go)
            {
            	System.out.println("************************************************");
                System.out.println("1).ADDING NEW STUDENT");
                System.out.println("2).DISPLAY ALL STUDENTS");
                System.out.println("3).DISPLAY A SINGLE STUDENT BY PRN");
                System.out.println("4).DELETE STUDENT");
                System.out.println("5).UPDATE STUDENT");
                System.out.println("6).EXIT");
                System.out.println("************************************************");
                try {
             	 int input= Integer.parseInt(br.readLine());
             	 switch (input) {
     			 case 1:
     		     //add a new student
     		     // taking inputs from users		 
     				 System.out.println("Enter the StudentPrn : ");
     				 int prn=Integer.parseInt(br.readLine());
     				 System.out.println("Enter the name : ");
     				 String Name =br.readLine();
     				 System.out.println("Enter the Address : ");
     				 String addr =br.readLine();
     				 System.out.println("Enter the contact no : ");
     				 String ph =br.readLine();
     				 System.out.println("Enter the Current year : ");
     				 int curry =Integer.parseInt(br.readLine());
     				 System.out.println("Enter the fathername : ");
     				 String fn =br.readLine();
     				 System.out.println("Enter the mothername : ");
     				 String mn =br.readLine();
     				 System.out.println("Enter the Branch of student : ");
     				 String stream =br.readLine();
     				 System.out.println("Enter the overallcgpa : ");
     				 Double ovcg =Double.parseDouble(br.readLine());
     			 // creating student object and setting values
     			 StudentDetails s=new StudentDetails();
     			 s.setStudentPrn(prn);
     			 s.setName(Name);
     			 s.setAddress(addr);
     			 s.setContactno(ph);
     			 s.setCurrentyear(curry);
     			 s.setFathername(fn);
     			 s.setMothername(mn);
     			 s.setOverallcgpa(ovcg);
     			 s.setStream(stream);
     			 
     			 //saving student object to database by calling insert of student dao
     			 int r=stdo.insert(s);
     			 System.out.println("ID "+ r+" student added");
     			 System.out.println("**************************************");
     			 
     			 break;
     			 case 2:
     				  //display all student	
     				 System.out.println("************************************************");
     				 List< StudentDetails> allStudents=stdo.getAllStudents();
     				 for( StudentDetails st:allStudents)
     				 {
     					 System.out.println("PRN : " +st.getStudentPrn());
     					 System.out.println("Name : " +st.getName());
     					 System.out.println("Address : " +st.getAddress());
     					 System.out.println("Phone Number : " +st.getContactno());
     					 System.out.println("Current Year : " +st.getCurrentyear());
     					 System.out.println("Father Name: " +st.getFathername());
     					 System.out.println("Mother Name : " +st.getMothername());
     					 System.out.println("Branch : " +st.getStream());
     					 System.out.println("Overall CGPA : " +st.getOverallcgpa());
     					 System.out.println("_______________________________________");
     				 }
     				 System.out.println("************************************************"); 
     			 break;
     			 case 3:
     				  //get single student data	
     				 System.out.println("Enter the PRN : ");
     				 int userId=Integer.parseInt(br.readLine());
     				 StudentDetails student=stdo.getStudent(userId);
     				 System.out.println("PRN : " +student.getStudentPrn());
   					 System.out.println("Name : " +student.getName());
   					 System.out.println("Address : " +student.getAddress());
   					 System.out.println("Phone Number : " +student.getContactno());
   					 System.out.println("Current Year : " +student.getCurrentyear());
   					 System.out.println("Father Name: " +student.getFathername());
   					 System.out.println("Mother Name : " +student.getMothername());
   					 System.out.println("Branch : " +student.getStream());
   					 System.out.println("Overall CGPA : " +student.getOverallcgpa());
   					 System.out.println("_______________________________________");
     			 break;
     			 case 4:
     				  //delete student	
     				 System.out.println("Enter your PRN : ");
     				 int delId=Integer.parseInt(br.readLine());
     				 stdo.deleteStudent(delId);
     				 System.out.println("Student deleted........");
     			 break;
     			 case 5:
     				  //update student	
     				 System.out.println("Enter the StudentPrn : ");
     				 int prnn=Integer.parseInt(br.readLine());
     				 StudentDetails student1=stdo.getStudent(prnn);
     				 System.out.println("PRN : " +student1.getStudentPrn());
   					 System.out.println("Name : " +student1.getName());
   					 System.out.println("Address : " +student1.getAddress());
   					 System.out.println("Phone Number : " +student1.getContactno());
   					 System.out.println("Current Year : " +student1.getCurrentyear());
   					 System.out.println("Father Name: " +student1.getFathername());
   					 System.out.println("Mother Name : " +student1.getMothername());
   					 System.out.println("Branch : " +student1.getStream());
   					 System.out.println("Overall CGPA : " +student1.getOverallcgpa());
   					 System.out.println("_______________________________________");
     				 System.out.println("Enter the name : ");
     				 String Namee =br.readLine();
     				 System.out.println("Enter the Address : ");
     				 String addre =br.readLine();
     				 System.out.println("Enter the contact no : ");
     				 String phno =br.readLine();
     				 System.out.println("Enter the Current year : ");
     				 int curryear =Integer.parseInt(br.readLine());
     				 System.out.println("Enter the fathername : ");
     				 String fnn =br.readLine();
     				 System.out.println("Enter the mothername : ");
     				 String mnn =br.readLine();
     				 System.out.println("Enter the Branch of student  : ");
     				 String branchh =br.readLine();
     				 System.out.println("Enter the overallcgpa : ");
     				 Double ocgpa =Double.parseDouble(br.readLine());
     				 stdo.updateStudent(prnn,Namee,addre,phno,curryear,fnn,mnn,branchh,ocgpa);
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
    	
    	else if(input1==2)
    	{
    		 int input2=0;
    		 boolean go2=true;
    		 while(go2)
    		 {
    		 System.out.println( "1).STUDENT DETAILS" );
        	 System.out.println( "2).Exit" );
        	 input2= Integer.parseInt(br.readLine());
        	 if(input2==1)
        	 {
        		 System.out.println("Enter the PRN : ");
 				 int userId=Integer.parseInt(br.readLine());
 				 StudentDetails student=stdo.getStudent(userId);
 				 System.out.println("PRN : " +student.getStudentPrn());
				 System.out.println("Name : " +student.getName());
				 System.out.println("Address : " +student.getAddress());
				 System.out.println("Phone Number : " +student.getContactno());
				 System.out.println("Current Year : " +student.getCurrentyear());
				 System.out.println("Father Name: " +student.getFathername());
				 System.out.println("Mother Name : " +student.getMothername());
				 System.out.println("Branch : " +student.getStream());
				 System.out.println("Overall CGPA : " +student.getOverallcgpa());
				 System.out.println("_______________________________________");
        	 }
        	 else {
        		 go2=false;
        	 }
    		 }
    	}
    	else if(input1==3) {
    		
			 go1=false;
    	}
    	else {
    		System.out.println("Invalid Choice");
    	}
    }
    }
}

