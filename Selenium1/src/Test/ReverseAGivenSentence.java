package Test;

public class ReverseAGivenSentence
{
	public static void main(String[] args)
	{
		String s1="My name is maruthi";
		//in order separate the words and we have to specify delimeter
		String[]arr=s1.split(" ");

		//which is used to reverse a sentence or rotate a 
		for (int i = 0; i < arr.length/2; i++)
		{
			String temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;	
		}
		for (int j = 0; j < arr.length-1; j++)
		{
			String s2=arr[j];
			String rev="";
			for (int k = s2.length()-1; k>=0; k--) 
			{
				rev=rev+s2.charAt(k);
			}

			arr[j]=rev;
		}
		for(String x:arr)
		{
			System.out.print(x+" ");
		}

	}
}