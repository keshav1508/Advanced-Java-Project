package Networking;

import java.io.IOException;
import java.net.*;

public class ucl {

	public static void main(String[] args) throws IOException {
	DatagramSocket s=new DatagramSocket();
	String msg="hi keshav this side";
	InetAddress ip=InetAddress.getByName("localhost");
	DatagramPacket m=new DatagramPacket(msg.getBytes(), msg.length(), ip,1111);
	s.send(m);
	s.close();
	
	

	}

}
