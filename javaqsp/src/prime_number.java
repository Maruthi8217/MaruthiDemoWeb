import java.util.Arrays;

public class prime_number {
	public static void main(String[] args) {
		/*int no=7;
	Boolean flage=false;
	for (int i = 2; i <no; i++)
	{
	if(no%i==0)
	{
		flage=true;
	}

}
if(flage==false)
{
	System.out.println(no);
}*/
		//wap to 1-10  even and odd numbers

		/*for (int i =1; i <=10; i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}*/
		//wap to print factorial of 5

		/*	int no=5;
		int fact=1;
		for (int i =no; i>=1; i--) 
		{
			fact=fact*i;
			no--;
		}
		System.out.println(fact);*/

		//wap to print prime no

		/*	int no=72;
		boolean flag=false;

		for (int i =2; i <no; i++)
		{
		if(no%i==0)
		{
			flag=true;
		}
		}
		if(flag==false)
		{
			System.out.println(no);
		}*/

		//wap revrce string

		/*		String name="manu";
		String rev="";
		for (int i =name.length()-1; i>=0; i-- )
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);

		 */

		//wap to array in asscending order.

		/*	int[] arr= {20,15,45,10};

		Arrays.sort(arr);

		for (int j =arr.length-1; j>=0; j--)
		{
			System.out.println(arr[j]);			
		}
		 */

		//wap to print largest number

		int[] arr= {10,45,24,56,15};
		int largest=arr[0];



		for (int j = 1;j < arr.length; j++) 
		{
			if(arr[j]>largest)

			{
				largest=arr[j];
			}

		}
		System.out.println(largest);
































	}
}
