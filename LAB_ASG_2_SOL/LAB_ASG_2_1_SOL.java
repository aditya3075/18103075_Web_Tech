import java.util.*;
public class Strings{
	public static int min(int a,int b)
	{
		if(a<b)
		{
			return a;
		}
		return b;
	}
	public static int Compare_Two_Strings(String first_str,String second_str)
	{
		int first_str_len=first_str.length();
		int second_str_len=second_str.length();
		for(int i=0;i<min(first_str_len,second_str_len);i++)
		{
			//based on unicode values
			int first_int=(int)first_str.charAt(i);
			int second_int=(int)second_str.charAt(i);
			if(first_int==second_int)
			{
				continue;
			}
			else
			{
				if(first_int>second_int)
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
		
	}
		return 0;

	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String first_str,second_str;
		System.out.println("Enter First String");
		first_str=sc.nextLine();
		System.out.println("Enter Second String");
		second_str=sc.nextLine();
		//System.out.print(first_str);	System.out.print(second_str);
		if(Compare_Two_Strings(first_str,second_str)==1)
		{
			System.out.println(first_str+" is lexicographically greater than "+second_str);
		}
		else if(Compare_Two_Strings(first_str,second_str)==0)
		{
			System.out.println(first_str+" is lexicographically equal to "+second_str);
		}
		else
		{
			System.out.println(first_str+" is lexicographically smaller than "+second_str);
		}

	}
}