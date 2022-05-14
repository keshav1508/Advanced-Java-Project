package Networking;

import java.io.*;
import java.net.*;

public class serverdemo {

public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(7777);
		
        System.out.println("SERVER IS READY");
        
        
		Socket s=ss.accept();
		
		 System.out.println("CONNECTION OCCURED BETWEEN CLIENT AND SERVER");
		 
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String)dis.readUTF();
		
		System.out.println("MESSAGE FROM CLIENT=>"+str);
		 
		
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       
	       System.out.println("Message for client");
	       String str1=br.readLine();
	       
	       DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	       dout.writeUTF(str1);
		dis.close();
		s.close();
		ss.close();
		

	}

}
