package Multithreading;

class test extends Thread{
	public void run()
	{
//		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(" Show priority: " + Thread.currentThread().getPriority());
		for(int i=0;i<3;i++)
		{
			Thread.yield();
			System.out.println("Child thread :" + i );
		}
	}
}


public class yieldprac {



	private static final int MAX_PRIORITY = 10;

	public static void main(String[] args) {
		test t=new test();
		t.setPriority(2);
		t.start();
		
		System.out.println(" Show priority parent: " + Thread.currentThread().getPriority());
		
		for(int i=0;i<3;i++)
		{
			
			System.out.println("Parent thread :" + i );
		}

	}

}
