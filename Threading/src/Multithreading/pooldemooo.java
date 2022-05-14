package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class pooldemooo implements Runnable {


	public String name;
	public pooldemooo(String temp)
	{
		name=temp;
	}
	public void run() {
		
		System.out.print("MY JOB ID" + Thread.currentThread().getId() + "Starting excuting" + name);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("MY JOB ID" + Thread.currentThread().getId() + "Stopped excuting");
	}
	
	public static void main(String[] args) {
		
          ExecutorService ex=Executors.newFixedThreadPool(3);
          for(int i=0;i<3;i++)
          {
        	  Runnable r=new pooldemooo("My Job"+ i);
        	  ex.execute(r);
          }
          ex.shutdown(); 
	}



}
