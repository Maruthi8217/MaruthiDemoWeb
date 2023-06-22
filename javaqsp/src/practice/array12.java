package practice;

public class array12 {
	public static void main(String[] args) {
		int[] arr={15,10,45,14};

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					arr[j]=arr[i];
				}
			}
		}
		System.out.println(arr);
	}
}
