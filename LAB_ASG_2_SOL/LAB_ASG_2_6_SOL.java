import java.util.*;
public class Sequence{
	public static void main(String []args)
	{
		try
		{
		int n;int cnt=0;int num;
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();num=n;
		if(n<=0)
		{
				System.out.print("Enter Positive number");
		}
		else
		{
			int[]res;
			res=new int[1000000];
			for(int i=0;i<1000000;i++)
			{
				res[i]=-1;
			}
			boolean flag=false;
			if(n==1)
			{
				res[0]=n;
			}
			++cnt;
		while(n!=1)
		{
				if((n>Integer.MAX_VALUE/3&&n%2!=0)||cnt<0||cnt==Integer.MAX_VALUE)
				{
					flag=true;
					System.out.println("Hailstone sequence for given number not possible because overflow occured!!");return;
				}
			if(n%2==0)
			{
				res[cnt]=n;
				n/=2;
			}
			else 
			{
				res[cnt]=n;
				n=3*n+1;
			}
			cnt++;
		}
		if(n==1&&flag==false){
			System.out.print("Hailstone Sequence for number ");
			System.out.println(num);
			System.out.print("is");
			System.out.print(" ");
			for(int i=0;i<res.length;i++)
			{
				if(res[i]!=-1){
				System.out.println(res[i]);
			System.out.print(" ");}
			}
			System.out.println(n);
		}
		}
	}
	catch(Exception e)
	{
		System.out.print("Sequence cannot be generated because the value entered results in Overflow !!!");
	}

	}
}