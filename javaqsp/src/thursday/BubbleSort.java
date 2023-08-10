package thursday;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {10,45,12,78,97,24};
		for (int i = 1; i < arr.length; i++)
		{
			for (int j = 1; j < arr.length; j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;

				}

			}
			

		}
		for (int k = 0; k < arr.length; k++) 
		{
          System.out.println(arr[k]);
		}
	}
}
