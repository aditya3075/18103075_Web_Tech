import java.util.*;
public class ops{
	public static void main(String []args)
	{
		
		long s=System.currentTimeMillis();//method used is System.currentTimeMillis()	
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Universe is 0,1,2,3,4,5,6,7,8,9,10");
		System.out.println("Enter Size of Set A");
		int a_size=sc.nextInt();
		System.out.println("Enter Set A");
		int []a_vis={0,0,0,0,0,0,0,0,0,0,0};
		int []b_vis={0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<a_size;i++)
		{
			int x=sc.nextInt();

			if(a_vis[x]==0)
			{
				a_vis[x]=1;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Set A contains :");
		for(int i=0;i<11;i++)
		{
			if(a_vis[i]==1)
			{
				System.out.println(i);
			}
		}

		System.out.println("Enter Size of Set B");
		int b_size=sc.nextInt();
		System.out.println("Enter Set B:");
		for(int i=0;i<b_size;i++)
		{
			int x=sc.nextInt();
			if(b_vis[x]==0)
			{
				b_vis[x]=1;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Set B contains :");
		for(int i=0;i<11;i++)
		{
			if(b_vis[i]==1)
			{
				System.out.println(i);
			}
		}
		boolean union=false;
		System.out.println("Union of two sets:");
		for(int i=0;i<11;i++)
		{
			if(a_vis[i]==1||b_vis[i]==1)
			{
				union=true;
				System.out.println(i);
			}
		}
		if(union==false)
		{
			System.out.println("No Union!!");
		}
		System.out.println("Intersection of two sets:");
		boolean Intersection=false;
		for(int i=0;i<11;i++)
		{
			if(a_vis[i]==1&&b_vis[i]==1)
			{
				Intersection=true;
				System.out.println(i);
			}
		}
		if(Intersection==false)
		{
			System.out.println("No Intersection!!");
		}

		System.out.println("Complement of Set A:");
		for(int i=0;i<11;i++)
		{
			if(a_vis[i]==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Complement of Set B:");
		for(int i=0;i<11;i++)
		{
			if(b_vis[i]==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Using Arrays ---time taken is -------");
		long f=System.currentTimeMillis();
		//System.out.println("Time taken");
		System.out.println(f-s);	
//------------------------////---------------------Using HashSet------///
		System.out.println("-----Using Data Structure -----");
		System.out.println("Universe is 0,1,2,3,4,5,6,7,8,9,10");
		s=System.currentTimeMillis();
		sc=new Scanner(System.in);
		System.out.println("Enter Size of Set A");
		a_size=sc.nextInt();
		System.out.println("Enter Set A");
		Set<Integer>a_set=new HashSet<Integer>();
		Set<Integer>Uni_set=new HashSet<Integer>();
		for(int i=0;i<=10;i++)
		{
			Uni_set.add(i);
		}
		for(int i=0;i<a_size;i++)
		{
			int x=sc.nextInt();
			if(x>10||x<0)
			{
				
		System.out.println("Only values in Universal Set are allowed!!");return;
			}
			a_set.add(x);
		}
		System.out.println("Set A contains: ");
		Iterator<Integer>itr=a_set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
        System.out.println("Enter Size of Set B");
		b_size=sc.nextInt();
		System.out.println("Enter Set B");
		Set<Integer>b_set=new HashSet<Integer>();
		for(int i=0;i<b_size;i++)
		{
			int x=sc.nextInt();
if(x<0||x>10)
		{System.out.println("Only values in Universal set are allowed!!");return;}
			b_set.add(x);
		}
		//System.out.println(a_set);
		System.out.println("Set B contains: ");
		itr=b_set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Union of Two sets A & B:");
		Set<Integer>un_set;
		un_set=new HashSet<Integer>(a_set);
		un_set.addAll(b_set);
		//System.out.println(un_set);
		itr=un_set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Intersection of Two sets A & B:");
		Set<Integer>in_set;
		in_set=new HashSet<Integer>(a_set);
		in_set.retainAll(b_set);
		//System.out.println(in_set);
		itr=in_set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Complement of Set A:");
		Uni_set.removeAll(a_set);
		itr=Uni_set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//System.out.println(Uni_set);
		for(int i=0;i<=10;i++)
		{
			Uni_set.add(i);
		}
		System.out.println("Complement of Set B:");
		Uni_set.removeAll(b_set);
		//System.out.println(Uni_set);
		itr=Uni_set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		f=System.currentTimeMillis();
		System.out.println("Time taken with Hashsets");
		System.out.println(f-s);
	}
	catch(Exception e)
	{
		System.out.println("Only values between 0-10 are allowed!!");
	}
	}
}