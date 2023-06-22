import java.util.Arrays;

public class SortinganArrayInAsscendingOrder 
{
	public static void main(String[] args) 
	{
		int[] arr= {10,50,78,45,16};
		for (int i = 1; i<=arr.length-1; i++)
		{
			for (int j = 1; j <=arr.length-1; j++)
			{
				if(arr[j-1]>arr[j])	
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}	
		for (int k = 0; k<=arr.length-1; k++)
		{
			System.out.println(arr[k]);
		}
	}
}
