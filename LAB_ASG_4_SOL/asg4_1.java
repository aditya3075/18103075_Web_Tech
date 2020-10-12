import java.util.*;
class Solution {
	public static void main(String[] args)
	{
		try{
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		Scanner inn= new Scanner(System.in);
		String[] crops = new String[n];
		for(int i=0;i<n;i++)
		{
			crops[i]=inn.nextLine().trim();
        }
        System.out.print(replant(crops));
    	}
    	catch(Exception e)
    	{
    		System.out.println("Error !!");
    	}
	}
	public static int replant(String[] crops)
	{
		int n=crops.length;
		int m=crops[0].length();
		char [][] Mat= new char [crops.length][crops[0].length()];
		for(int i=0;i<n;i++)
		{
			String temp=crops[i];
			for(int j=0;j<m;j++)
			{
				Mat[i][j]=temp.charAt(j);
			}
		}
		int [][] vis=new int [crops.length][crops[0].length()];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				vis[i][j]=0;
			}
		}
		int res=0;
		        HashSet<Integer>hs=new HashSet<Integer>();
				for(int iu=0;iu<26;iu++)
				{
					hs.add(iu);
				}
		for(int j=1;j<m;j++)
		{
		
			if(Mat[0][j]==Mat[0][j-1])
			{
				vis[0][j]=1;
				hs.remove((int)Mat[0][j]-97);
			    
			    hs.remove((int)Mat[0][j-1]-97);
	     	    
	     	    Iterator<Integer>iter=hs.iterator();
			    
	     	    Mat[0][j]=(char)(iter.next()+97);
                res++;
			}
		}
//-------------
		for(int i=1;i<n;i++)
		{
			if(Mat[i][0]==Mat[i-1][0])
			{
				vis[i][0]=1;
				hs.remove((int)Mat[i][0]-97);
			    

			    hs.remove((int)Mat[i-1][0]-97);
	     	    Iterator<Integer>iter=hs.iterator();
	     	    Mat[i][0]=(char)(iter.next()+97);
                res++;
			}
		}
//----------------------
		for(int j=1;j<m;j++)
		{
			if(Mat[n-1][j]==Mat[n-1][j-1])
			{
				vis[n-1][j]=1;
			    hs.remove((int)Mat[n-1][j]-97);
			    hs.remove((int)Mat[n-1][j-1]-97);
	     	    Iterator<Integer>iter=hs.iterator();
	     	    Mat[n-1][j]=(char)(iter.next()+97);
                res++;
			}
		}
//-------------------
		for(int i=1;i<n;i++)
		{
			if(Mat[i][m-1]==Mat[i-1][m-1])
			{
				vis[i][m-1]=1;
			    hs.remove((int)Mat[i][m-1]-97);
			    hs.remove((int)Mat[i-1][m-1]-97);
	     	    Iterator<Integer>iter=hs.iterator();
			    
	     	    Mat[i][m-1]=(char)(iter.next()+97);
                res++;
			}
		}
		for(int i=1;i<n-1;i++)
		{
			for(int j=1;j<m-1;j++)
			{

					if(vis[i-1][j]==0)
					{
					if(Mat[i][j]==Mat[i-1][j])
					{
					     hs.remove((int)Mat[i][j]-97);
					     hs.remove((int)Mat[i-1][j]-97);
					     Iterator<Integer>iter=hs.iterator();
					     vis[i][j]=1;
					     Mat[i][j]=(char)(iter.next()+97);res++;
					}
					}
					if(vis[i][j-1]==0)
					{
					if(Mat[i][j]==Mat[i][j-1])
					{

					    hs.remove((int)Mat[i][j]-97);
					    hs.remove((int)Mat[i][j-1]-97);
					     Iterator<Integer>iter=hs.iterator();
					     vis[i][j]=1;
					     Mat[i][j]=(char)(iter.next()+97);res++;
					}
				    }
					if(vis[i+1][j]==0)
					{
					if(Mat[i][j]==Mat[i+1][j])
					{
					     hs.remove((int)Mat[i][j]-97);
					     hs.remove((int)Mat[i+1][j]-97);
					     Iterator<Integer>iter=hs.iterator();
					     vis[i+1][j]=1;
					     Mat[i+1][j]=(char)(iter.next()+97);res++;
					}
					}
					if(vis[i][j+1]==0)
					{
					if(Mat[i][j]==Mat[i][j+1])
					{

					     hs.remove((int)Mat[i][j]-97);
					    hs.remove((int)Mat[i][j+1]-97);
					     Iterator<Integer>iter=hs.iterator();
					     vis[i][j+1]=1;
					     Mat[i][j+1]=(char)(iter.next()+97);res++;
					}
					
				}
				
			}

					
					
				    
		}

		return res;

	}
}
