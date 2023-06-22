
public class FindLargestNumber 
{
	public static void main(String[] args) 
	{
		int[] arr= {50,40,78,98,45};
		int num=arr[0];
		for (int i = 1; i <=arr.length-1; i++)
		{
			if(num>arr[i])
			{
				num=arr[i];
			}
		}
		System.out.println(num);
	}
}
