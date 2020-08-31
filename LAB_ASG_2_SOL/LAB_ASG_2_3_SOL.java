import java.util.*;
public class Sort_Strings{

	public static int Compare_Chars(char a,char b)
	{
		int a_int=(int)a;
		int b_int=(int)b;
		if(a>b)
		{
			return 1;
		}
		else if(a<b)
		{
			return -1;
		}
		return 0;
	}

	public static void main(String []args)
	{
		int n;//Enter size of String
		try{
		System.out.println("Enter size of string ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();String s="";
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter String");
		s=scc.nextLine();
		char arr[]=s.toCharArray();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Compare_Chars(arr[i],arr[j])==1)
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.println("Sorted String :");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}
	catch(Exception e)
	{
		System.out.println("Incorrect Input!!");
	}
	}
}