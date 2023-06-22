package programming;

import java.util.Iterator;

public class primenumber 
{
	public static void main(String[] args) {
		int no=7;
		boolean flage=true;
		for (int i =2; i <no; i++)
		{
			if (no%i==0)
			{
				flage=false;
				break;
			}	
		}
		if (flage==true) 
		{
			System.out.println(no);	
		} 
		else 
		{
            System.out.println("not a prime number");
		}

	}

}
