import java.lang.*;
import java.util.*;
class threaded implements Runnable
{
	int start,end;
	static int maxdiv;
	static int finalres;
	public threaded(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public static int countdivisors(int n)
	{
		int res=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				res++;
			}
		}
		return res;
	}
	public void run()
	{
		synchronized(this)
		{
		for(int i=start;i<=end-1;i++)
		{
			if(countdivisors(i)>maxdiv)
			{
				maxdiv=countdivisors(i);
				finalres=i;
			}
		}
	}
	}
	public static void main (String[]args)throws Exception
	{

        long s=System.currentTimeMillis();
		try
		{
		Thread t1=new Thread(new threaded(1,10000));
		Thread t2=new Thread(new threaded(10000,20000));
		Thread t3=new Thread(new threaded(20000,30000));
		Thread t4=new Thread(new threaded(30000,40000));
		Thread t5=new Thread(new threaded(40000,50000));
		Thread t6=new Thread(new threaded(50000,60000));
		Thread t7=new Thread(new threaded(60000,70000));
		Thread t8=new Thread(new threaded(70000,80000));
		Thread t9=new Thread(new threaded(80000,90000));
		Thread t10=new Thread(new threaded(90000,100001));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
        }
        catch(Exception e)
        {}
        long e=System.currentTimeMillis();
        System.out.println("The largest number of divisors are:");
        System.out.println(maxdiv);
        System.out.println("The number with largest number of divisors:");
        System.out.println(finalres);
        System.out.println("Elapsed Time in seconds using multiple threads..");
        System.out.println((double)(e-s)/1000);
	}
}