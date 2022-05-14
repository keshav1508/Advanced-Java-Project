package Networking;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDEMO {

	public static void main(String[] args) throws MalformedURLException {
	    URL ur=new URL("https://docs.google.com/spreadsheets/d/1dgzucZQ08WO4-J1n2PnaaBCH7yYmH-Y-UGH86qUbOwE/edit#gid=556314467");
	    System.out.println("Protocol"+ur.getProtocol());
	    System.out.println("Host"+ur.getHost());
	    System.out.println("Port Number"+ur.getPort());
	    System.out.println("Path Name"+ur.getPath());
	}

}
