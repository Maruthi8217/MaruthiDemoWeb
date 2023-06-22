
public class ArmStrongNumber 
{
	public static void main(String[] args)
	{
		int no=143;
		int rem=0;
		int copy=no;
		while(no!=0)
		{
			int temp=no%10;
			rem=rem+(temp*temp*temp);
			no=no/10;
		}

		if(rem==copy)
		{
			System.out.println("arm strong number" + rem);
		}
		else
		{
			System.out.println("not arm strong number");
		}
	}
}
