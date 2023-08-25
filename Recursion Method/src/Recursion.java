
public class Recursion
{
	public static int rec(int k)
	{
		if(k>0)
		{
			return k+rec(k-1);
		}
		else
		{
			return 0;
		}
		
	}
	 public static int sum(int start, int end)
	 {
		    if (end > start) 
		    {
		      return end + sum(start, end - 1);
		    } 
		    else 
		    {
		      return end;
		    }
	 }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int result=rec(10);
		System.out.println(result);
		int results = sum(5, 10);
	    System.out.println(results);

	}

}

