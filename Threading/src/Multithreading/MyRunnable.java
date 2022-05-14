package Multithreading;


class myrunnabledemo implements Runnable{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Class :" + i);
		}
	}
}
public class MyRunnable {

	public static void main(String[] args) {
		myrunnabledemo r=new myrunnabledemo();
		Thread t1=new Thread(r);
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("parent Class :" + i);
		}

	}

}
