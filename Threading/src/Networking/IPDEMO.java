package Networking;

import java.io.*;
import java.net.*;


public class IPDEMO {

	public static void main(String[] args) throws IOException {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the website name");
       String web=br.readLine();
       InetAddress in=InetAddress.getByName(web);
       System.out.println("IP ADDRESS OF WEBSITE =>"+in);
       
       InetAddress address=InetAddress.getLocalHost();
       System.out.println("Local Host address =>"+address);
       
       InetAddress address1=InetAddress.getByName("103.228.50.115");
       InetAddress address2=InetAddress.getByName("www.mitaoe.ac.in");
       System.out.println("Comparing two address =>"+address1.equals(address2));
       
       InetAddress[] add=InetAddress.getAllByName(web);
       System.out.println("Get all by name result =>"+add);
       
       
	}

}
