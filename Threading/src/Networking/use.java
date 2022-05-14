package Networking;

import java.io.*;
import java.net.*;

public class use {

	public static void main(String[] args) throws IOException {
		DatagramSocket ss=new DatagramSocket(1111);
		
		byte [] b=new byte [1000];
		
		DatagramPacket ssm=new DatagramPacket(b, 1000);
		ss.receive(ssm);
		String str=new String(b);
		System.out.print("msg" + str);
		
		

	}

}
