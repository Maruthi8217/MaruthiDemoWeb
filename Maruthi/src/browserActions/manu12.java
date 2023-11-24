package browserActions;

public class manu12
{
	public static void main(String[] args)
	{
		int no=153;
		int copy=no;
		int fact=0;
		while(no!=0)
		{
			int rem=no%10;
			fact=fact+(rem*rem*rem);
			no=no/10;
		}
		if(fact==copy)
		{
			System.out.println("copy");
		}
	}
}