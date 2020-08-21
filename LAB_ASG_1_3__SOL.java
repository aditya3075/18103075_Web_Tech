import java.util.*;

class Graph
{
	static class Edge
	{
		int src;int dest;int wt;
		Edge()
		{
			src=0;dest=0;wt=0;
		}

	}	
	public static void printshortest(String res,boolean []vis,Edge[]edges,int []dist,int E,int V,int src,int dest)
	{
		String ress="";
		ress+=src;
		vis[src]=true;
		for(int i=0;i<E;i++)
		{
			
			if(edges[i].dest!=dest&&vis[edges[i].dest]==false)
			{
            printshortest(res,vis,edges,dist,E,V,edges[i].dest,dest);
			}
			else if(edges[i].dest==dest)
			{
				System.out.println(ress+"->"+edges[i].dest);return;
			}
		    
		}
		vis[src]=false;
       
	}
	public static boolean checknegutil(int []dist,Edge[] edges,int E,int V)
	{
		for(int i=0;i<E;i++)
		{
			int u,v,wt;
			u=edges[i].src;
			v=edges[i].dest;
			wt=edges[i].wt;
			if(dist[u]!=Integer.MAX_VALUE&&dist[v]>dist[u]+wt)
			{
				return true;
			}
		}
		return false;
	}
	public static void NegativeCycle(Edge[] edges,int src,int dest,int E,int V)
	{
		int []dist=new int [E+1];
		for(int i=0;i<V;i++)
		{
			dist[i]=Integer.MAX_VALUE;
		}
		dist[src]=0;
		for(int i=0;i<V;i++)
		{
			for(int j=0;j<E;j++)
			{
				int u=edges[j].src;
				int v=edges[i].dest;
				int w=edges[i].wt;
				if(dist[v]>dist[u]+w&&dist[u]!=Integer.MAX_VALUE)
				{
					dist[v]=dist[u]+w;
				}
			}
		}
		if(checknegutil(dist,edges,E,V)==true)
		{
			System.out.println("Negative Cycle exists");
		}
		else
		{
			boolean vis[]=new boolean[V];
			String res="";
			printshortest(res,vis,edges,dist,E,V,src,dest);
		}
	}
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of vertices");
		int V=s.nextInt();
		System.out.println("Enter number of edges");
		int E=s.nextInt();
		Edge[] edges=new Edge[E];
		for(int i=0;i<E;i++)
		{
			edges[i]=new Edge();
		}
	    System.out.println("Enter edges");
		for(int i=0;i<E;i++)
		{
			System.out.println("Enter vertex 1");
			int a=s.nextInt();
			System.out.println("Enter vertex 2");
			int b=s.nextInt();
			System.out.println("Enter weight");
			int c=s.nextInt();
			edges[i].src=a;
			edges[i].dest=b;
			edges[i].wt=c;
		}
		int src;int dest;
		System.out.println("Enter source");
        src=s.nextInt();
		System.out.println("Enter Destination");
		dest=s.nextInt();
		NegativeCycle(edges,src,dest,E,V);
	}
}