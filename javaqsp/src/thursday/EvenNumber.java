package thursday;

public class EvenNumber 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <=10; i++) 
		{
			int fib1=i;
			int fib2=1;
			int fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
			
		}
	}
}
