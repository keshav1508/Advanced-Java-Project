package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class kk implements Runnable{
	public String name;
	public kk(String temp)
	{
		name=temp;
	}
	public void run()
	{
		System.out.println("Thread" + Thread.currentThread().getId() + "Started Excutingn to work" +name);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread" + Thread.currentThread().getId() + "Stopped Excuting");
	}
}
public class PoolDemo {

	public static void main(String[] args) {
		
		ExecutorService ex= Executors.newFixedThreadPool(5);
		ExecutorService ex1= Executors.newFixedThreadPool(4);
		ExecutorService ex2= Executors.newFixedThreadPool(3);
		for(int i=1;i<=20;i++)
		{
			
			Runnable r=new kk("Painter:" + i);
			Runnable r1=new kk("Electrician:" + i);
			Runnable r2=new kk("Pumbler:" + i);
			ex.execute(r); 
			ex1.execute(r1);
			ex2.execute(r2);
		}
		
	  ex.shutdown();
	}

}
