package Networking;

import java.io.*;
import java.net.*;

public class se {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(7777);
		System.out.print("Server started");
		Socket s=ss.accept();
		System.out.print("Connected with client successfully");
		
		DataInputStream dout=new DataInputStream(s.getInputStream());
		String str=(String)dout.readUTF();
		System.out.print("Msg from client");
		System.out.print(str);
		
		

	}

}
