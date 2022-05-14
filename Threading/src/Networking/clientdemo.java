package Networking;

import java.io.*;
import java.net.*;

public class clientdemo {

	public static void main(String[] args) throws UnknownHostException, IOException  {
		
       Socket s=new Socket("localhost",7777);
       
       System.out.println("CLIENT IS READY");
       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Message for Server");
       String str=br.readLine();
       
       DataOutputStream dout=new DataOutputStream(s.getOutputStream());
       dout.writeUTF(str);
       
  	   
	 
  		DataInputStream dis=new DataInputStream(s.getInputStream());
  		String str1=(String)dis.readUTF();
  		
  		System.out.println("MESSAGE FROM Server=>"+str1);
       
       s.close();
       br.close();
       dout.close();
       
	}

}
