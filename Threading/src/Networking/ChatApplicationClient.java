package Networking;
import java.io.*;
import java.net.*;
public class ChatApplicationClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
    Socket s=new Socket("localhost",7777);
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
    String str,str1;
    System.out.println("Msg for Server");
    while(!(str=br.readLine()).equals("exit"))
    { 	
    	  System.out.println("Msg for Server");
         dout.writeUTF(str);
  
    str1=br1.readLine();
    System.out.println("Msg from Server: "+ str1);
  
    }
    dout.close();
    br.close();
    s.close();
    br1.close();
	}

}
