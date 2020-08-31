import java.util.*;
public class numbers
{
	public static void main(String[]args)
	{
		int sum=0;
		int resss=0;
		int i=1;
		ArrayList<Integer>res=new ArrayList<Integer>();
		while(true)
		{
			sum+=i;

			if(i>Math.sqrt(Integer.MAX_VALUE))
			{
				//because if i>square root of value then  i*i will become greater than MAX_VALUE
				resss=i;
				break;

			}
			if(i*i==sum)
			{
				res.add(i);
			}
			i++;
		}
		System.out.println("Values such that given condition holds.");
		for(int it=0;it<res.size();it++)
		{
			
			System.out.println(res.get(it));
		}
		System.out.println("Smallest n such that given condition holds");
		System.out.println(resss-1);
	}
}