import java.util.*;
class Graph
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int a,int b)
	{
		adj.get(a).add(b);
		adj.get(b).add(a);
	}
	public static void printpath(ArrayList<ArrayList<Integer>>adj,int V,int E,int src,int dest)
	{
		Queue<Integer>q=new LinkedList<>();
		int []par=new int[V];
		int dist[]=new int[V];
		q.add(src);
		boolean []vis=new boolean[V];
		vis[src]=true;
		par[src]=-1;
		while(!q.isEmpty())
		{
			int u=q.peek();
			q.remove();
			for(int v=0;v<adj.get(u).size();v++)
			{
				int i=adj.get(u).get(v);
				if(!vis[i])
				{
					vis[i]=true;
					q.add(i);
					dist[i]=dist[u]+1;
					par[i]=u;
				}
			}
		}
		if(!vis[dest])
		{
			System.out.println("No path exists!!");
		}
		else
		{
			LinkedList<Integer>path=new LinkedList<Integer>();
			for(int v=dest;v!=-1;v=par[v])
			{
				path.add(v);
			}
			System.out.println("Path");
			for(int i=path.size()-1;i>=0;i--)
			{
				System.out.println(path.get(i));
			}
		}
	}
	public static void main(String []args)
	{
		int num;
		System.out.println("Enter number of vertices");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(num);
		for(int i=0;i<num;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		System.out.println("Enter number of edges");
		int E=sc.nextInt();
		System.out.println("Enter Edges");
		for(int i=0;i<E;i++)
		{
			int a=sc.nextInt();	
			int b=sc.nextInt();
			addEdge(adj,a,b);
		}
		int src;
		int dest;
		System.out.println("Enter Source");
		src=sc.nextInt();

		System.out.println("Enter Destination");
		dest=sc.nextInt();
		printpath(adj,num,E,src,dest);
	}
}