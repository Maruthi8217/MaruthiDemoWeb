package programming;

public class sum_of_digits 
{
public static void main(String[] args) {
	/*int[] arr= {1,3,5,7,8};
	int sum=0;
	for (int i = 0; i < arr.length; i++) 
	{
	sum=sum+arr[i];	
	}
	System.out.println(sum);*/
	
	int no=1234;
	int sum=0;
	while(no!=0)
	{
	int	rem=no%10;
	sum=sum+rem;
	no=no/10;
	}
	
	System.out.println(sum);
}
}
