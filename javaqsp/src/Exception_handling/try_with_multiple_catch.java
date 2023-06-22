package Exception_handling;

public class try_with_multiple_catch 
{
	public static void main(String[] args)
	{
        try
        {
        	int a=1/0;
        }
        catch(ArithmeticException E)
        {
        	System.out.println("exception handled 1");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("exception handled 2");
        }
	catch(Exception e)
        {
		System.out.println("exception handled 3");
		
        }
	
	
	}
	
}
