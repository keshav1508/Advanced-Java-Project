package Networking;
import java.net.*;
import java.io.*;
public class UDPCLIENT {

	public static void main(String[] args) throws IOException {
		DatagramSocket dp=new DatagramSocket();
		String msg="Hi keshav this side";
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket dm=new DatagramPacket(msg.getBytes(), msg.length(), ip, 1111);
		dp.send(dm);
      dp.close();
     
	}

}
