import java.util.*;
class numbers extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class reverse extends Thread{
	public void run()
	{
		for(int i<10;i=0;i++)
		{
			System.out.println(i);
		}
	}
public static void main(String args[])
	{
		numbers n=new numbers();
		reverse r=new reverse();
		n.start();
		r.start();
		
	}
}
	
	
	
