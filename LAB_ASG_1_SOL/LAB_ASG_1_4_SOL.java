import java.util.*;
class LAB_ASG_1_4_SOL
{
	static boolean Anagrams(char []a,char []b)
	{
		int len1=a.length;
		int len2=b.length;
		if(len1!=len2)
		return false;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<len1;i++)
		{
		if(a[i]!=b[i])
		{
		return false;
		}
		}
		return true;
	}
	public static void main(String []args)
	{

	  	String first_str;//Represents first string
	  	String second_str;//Represents second string to be counted times.
	  	Scanner sc=new Scanner(System.in);
	  	System.out.println("Input first String");
	  	first_str=sc.nextLine();
	  	System.out.println("Input second String ");
	  	second_str=sc.nextLine();
		
		char a[]=first_str.toCharArray();
		char b[]=second_str.toCharArray();
		if(Anagrams(a,b))
		System.out.println("Anagrams");
		else
		System.out.println("Not Anagrams");
	}
}