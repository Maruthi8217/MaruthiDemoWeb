
public class SortingAnArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {60,30,20,40,15};

		for (int i = 1; i <=arr.length-1; i++)
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
		for (int k =arr.length-1; k>=0; k--)
		{
		      System.out.println(arr[k]);	
		}

	}
}
