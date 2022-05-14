package Multithreading;


class mythread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Class :" + i);
		}
	}
}
public class ExtendDemo {

	public static void main(String[] args) {
		mythread k=new mythread();
		k.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Parent thread :" + i);
		}
	}

}
