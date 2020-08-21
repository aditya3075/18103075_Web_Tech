import java.util.*;
import java.io.*;
class LAB_ASG_1_2_SOL{

	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paragraph");
		String str=sc.nextLine();
		Map<String,String>mp;
		mp=new HashMap<String,String>();
		int n;
		System.out.println("Enter the number of strings in vector");
		Scanner scc=new Scanner(System.in);
		n=scc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter string");
			String a;
			a=sc.nextLine();
			//System.out.println("Enter to be replace string");
			String b="";
			b+=a.charAt(0);
			for(int j=0;j<a.length()-1;j++)
			{
			b+="*";
			}
			//b=sc.nextLine();
			mp.put(a,b);
		}
			Iterator<String>it=mp.keySet().iterator();
			while(it.hasNext())
			{
			    String temp=it.next();
			    str=str.replace(temp,mp.get(temp));
		    }
		    System.out.println("Final String After making changes");
		    System.out.println(str);
	   
	}
}