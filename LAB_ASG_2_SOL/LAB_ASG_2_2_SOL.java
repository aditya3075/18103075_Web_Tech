import java.util.*;
public class CSort
{
	public static void Csort_util(int []arr,int n)
	{
		int cnt[]=new int[21];
		for(int i=0;i<21;i++)
		{
			cnt[i]=0;
		}
		for(int i=0;i<=n-1;i++)
		{
			cnt[arr[i]]++;
		}
		for(int i=1;i<=20;i++)
		{
			cnt[i]+=cnt[i-1];
		}
		int []res=new int[n];
		for(int i=n-1;i>=0;i--)
		{
			res[cnt[arr[i]]-1]=arr[i];
			--cnt[arr[i]];
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=res[i];
		}
	}

	public static void main(String[]args)
	{
		try
		{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int []arr;
		arr=new int[n];
		int cnt=1;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element ");
			System.out.println(cnt);
			cnt++;
			int x=sc.nextInt();
			if(x>20||x<0)
			{
				System.out.println("Values between 0-20 are allowed only");return;
			}
			arr[i]=x;
		}
		


		System.out.println("Array before Counting Sort: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
		Csort_util(arr,n);
		System.out.println("Array After Counting Sort: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		}
		catch(Exception E)
		{
			System.out.println("Value entered cannot be accepted,Enter Value Again!!");
		}

	}	
}