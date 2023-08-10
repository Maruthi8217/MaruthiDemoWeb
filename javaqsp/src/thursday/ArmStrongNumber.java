package thursday;

public class ArmStrongNumber
{
	public static void main(String[] args)
	{
     int no=153;
     int copy=no;
     int mo1=0;
     while(no!=0)
     {
    	 int  rem=no%10;
    	 mo1=mo1+(rem*rem*rem);
    	 no=no/10;
    	 
     }
	
	System.out.println(mo1);
	}
}
