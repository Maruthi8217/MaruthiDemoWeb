package Test;

public class HappyNumber
{
	public static void main(String[] args)
	{
     int number=29;
     int square=0;
     while(number!=0)
     {
    	 int rev=number%10;
    	 square=square+ rev*rev;
    	 number=number/10;
     }
     while(square!=0)
     {
    	int rem=square%10;
    	if(rem==1)
    	{
    		System.out.println("its a happy number");
    		break;
    	}
    	
    	square=square/10;
     }
	}
}
