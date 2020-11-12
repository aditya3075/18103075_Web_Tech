import java.util.*;
import java.lang.Thread.*;
class threaded implements Runnable{
	public void run()
	{
		try{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
			if(i%10==0)
			{
				System.out.println("String");
			}
		}
	}
	catch(InterruptedException e)
	{
		System.out.println("Exception Occured..");
	}
	}
	public static void main(String[]args) throws Exception
	{
       Thread t =new Thread(new threaded());
       t.start();
	}
}