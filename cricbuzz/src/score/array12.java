package score;

public class array12 
{
	public static void main(String[] args) //to find largest number in array.
	{
		int[] arr= {10,20,43,5,45};
		int lens=arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
		if(arr[i]>lens)	
        {
			lens=arr[i];
        }
		
        }
        System.out.println(lens);
	}
}
