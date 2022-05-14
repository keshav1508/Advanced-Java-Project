package Networking;

import java.net.*;
import java.io.*;

public class UDPSERVER {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(1111);
		
		byte [] b=new byte [1000];
		
		DatagramPacket m=new DatagramPacket(b, 1000);
	    
	    ds.receive(m);
		
		String str=new String(b);
		
		System.out.println("msg" + str);
		
		ds.close();
       

	}

}
