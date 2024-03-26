import java.util.*;
class numbers extends Thread //implements runnable
{
	public void run()
	{
		Thread.current Thread().setpriority(Thread.MAX-PRIORITY);
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+"\n");
		}
	}
}
class reverses extends Thread{
	public void run()
	{
		for(int i=10;i>0;i--)
		{
			System.out.println(i+"\n");
		}
	}
public static void main(String args[])
	{
		numbers n=new numbers();
		reverses r=new reverses();
		n.start();
		r.start();
		
	}
}
	
	
	
