package Networking;

import java.io.*;
import java.net.*;

public class ChatApplicationserver {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(7777);
		
		System.out.println("Server is ready");
		
		Socket s=ss.accept();
		
		System.out.println("Connection is established between client and server");
		DataInputStream dis=new DataInputStream(s.getInputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream de =new PrintStream(s.getOutputStream());
		while(true)
		{
		String str,str1;
		while((str=(String)dis.readUTF())!=null)
		{
			System.out.println("Msg from client: "+ str);
			System.out.println("Msg for client: ");
			str1=br.readLine();
			de.println(str1);
		}
		
		
		
		s.close();
		ss.close();
		dis.close();
		br.close();
		System.exit(0);
		}
	}

}
