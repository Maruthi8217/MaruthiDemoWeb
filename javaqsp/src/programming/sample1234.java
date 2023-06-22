package programming;

public class sample1234
{
    
	/*public static int m(int a)
	{
	int b=a;
	return b;
	}*/
	
	
	public static void main(String[] args) 
	{
	  sample1234 s1 = new sample1234();
	  boolean a1 = s1.j1(15);
	  System.out.println(a1);
	}
	
	
	
/*	public int manu(int a,int b)
	{
		int c=a*b;
		
		return c;
	}*/
	
	public boolean j1(int a) 
	{
		boolean d=false;
		int c=a;
		if(c%3==0 && c%5==0)
		{
			 d=true;
		}
		return d;
	}
	
}
