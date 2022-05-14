package Networking;
import java.io.*;
import java.net.*;

public class cl {

	public static void main(String[] args) throws UnknownHostException, IOException {
	Socket s=new Socket("localhost",7777);
	System.out.print("Client started");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter msg for server");
	String str=br.readLine();
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	dout.writeUTF(str);
	s.close();
	dout.close();
	
	}

}
