package Multithreading;

class Sachida extends Thread{
	public void run()
	{
		System.out.println(" Child Sachida Thread ID :" + Thread.currentThread().getId());
		System.out.println(" Child Sachida Thread Name :" + Thread.currentThread().getName());
		Thread.currentThread().setName("Sachida Dubey");
		System.out.println(" New Name After Assigning: " + Thread.currentThread().getName() );
		System.out.println(" Show priority: " + Thread.currentThread().getPriority());
		for(int i=0;i<3;i++)
		{
			System.out.println(" Child Sachida Thread :" + i );
		}
	}
}
class Keshav extends Thread{
	public void run()
	{
		System.out.println(" Child Keshav Thread ID :" + Thread.currentThread().getId());
		System.out.println(" Child Keshav Thread Name :" + Thread.currentThread().getName());
		Thread.currentThread().setName("Keshav Dubey");
		System.out.println(" New Name After Assigning: " + Thread.currentThread().getName() );
		System.out.println(" Show priority: " + Thread.currentThread().getPriority());
		for(int i=0;i<3;i++)
		{
			System.out.println(" Child Keshav Thread :" + i );
			try {
				Thread.sleep(5000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class extendthreadpriority {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		Sachida s=new Sachida();
		s.setPriority(8);
		s.start();
		s.join();
		
		Keshav k=new Keshav();
		k.setPriority(3);
		k.start();
		k.join();
		
//		Thread.currentThread().setPriority(10);
//		Thread.yield();
		System.out.println(" Parent Thread ID :" + Thread.currentThread().getId());
		System.out.println(" Parent Thread Name :" + Thread.currentThread().getName());
		Thread.currentThread().setName("Attal Dubey Renu Dubey");
		System.out.println(" New Name After Assigning: " + Thread.currentThread().getName() );
		System.out.println(" Show priority: " + Thread.currentThread().getPriority());
		for(int i=0;i<3;i++)
		{
			System.out.println("Parent thread :" + i );
		}

	}

}
