import java.util.*;
class LAB_ASG_1_1_SOL
{
	static int numberoftimes(String Str,String substr)
	{
		int str_len=Str.length();
		int substr_len=substr.length();
		int num=0;
		char tA[]=substr.toCharArray();
		Arrays.sort(tA);
		substr=new String(tA);
		for(int i=0;i<Str.length()-substr_len+1;i++)
		{
			String temp=Str.substring(i,i+substr_len);
			tA=temp.toCharArray();
			Arrays.sort(tA);
			temp=new String(tA);
			if(temp.equals(substr))
			{
				num++;
			}
		}
		return num;
	}

	static public void main(String []args)
	{
	  	String Str;//Represents original string
	  	String substr;//represents substring to be counted times
	  	Scanner sc=new Scanner(System.in);
	  	System.out.println("Input String");
	  	Str=sc.nextLine();
	  	System.out.println("Input SubString");
	  	substr=sc.nextLine();
	  	System.out.println(numberoftimes(Str,substr));
	  	
	}
}