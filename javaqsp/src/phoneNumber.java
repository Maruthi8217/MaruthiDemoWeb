import java.util.Arrays;

public class phoneNumber {
	public static void main(String[] args) 
	{
		//wap to 1-10

		/*for (int i = 1; i <=10; i++)
		{
           System.out.println(i);
		}*/

		//wap to print even numbers
		/*	for (int i = 1; i <=10; i++)
		{
		if(i%2==0)
		{
			System.out.println(i);
		}*/
		//wap to print prime number

		/*int no=6;
		boolean flag=false;
		for (int i = 2; i <no; i++)
		{
			if(no%i==0)
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println(no);
		}
		 */
		/*	//wap to factorial
		int no=5;
		int fact=1;
		for (int i =no; i>=1; i--)
		{
		fact=fact*i;
		no--;
		}
		System.out.println(fact);
		 */

		//wap to sort an array
		/*	int[] arr= {10,7,89,56,98,102};
		Arrays.sort(arr);
		for (int i =arr.length-1; i>=0; i--)
		{
		System.out.println(arr[i]);	
		}
		 */
		//wap to revrce A string
		/*String name="maruthi";
		String rev="";
		for (int i =name.length()-1; i>=0; i--)
		{
		   rev=rev+name.charAt(i);	
		}
		System.out.println(rev);

		 */
		//wap to Strong arm 

		int no=153;
		int sum=0;
		int copy=no;
		while (no!=0)
		{
			int rem=no%10;
			sum=sum+ (rem*rem*rem);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println(sum);
		}


































	}
}
