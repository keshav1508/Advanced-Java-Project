package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class keshavd implements Runnable{
	public String name;
	public keshavd(String temp)
	{
		name=temp;
	}
	public void run()
	{
		System.out.println("Thread" + Thread.currentThread().getId() + "Started Excuting" +name);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread" + Thread.currentThread().getId() + "Stopped Excuting");
	}
}
public class Pooldemoc {

	public static void main(String[] args) {
		ExecutorService ex= Executors.newFixedThreadPool(3);
		for(int i=0;i<6;i++)
		{
			
			Runnable r=new keshavd("My Job_:" + i);
			ex.execute(r);
		    
		}
	  ex.shutdown();
	}

}
