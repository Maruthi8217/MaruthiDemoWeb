package Exception_handling;

public class tryandcatch_block 
{
	public static void main(String[] args)
	{
      System.out.println(10);
      System.out.println(20);
      int b=20;
      try
      {
      int c=1/0;
      
      }
      catch(ArithmeticException e)
      {
    	  System.out.println("exception handled");
      }
      System.out.println(20);
	}
}
