package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class sample34
{
	public static void main(String[] args)
	{

		String s1="aaabbbccccdddeeeffff";
        manu(s1);
		
	}        

	public int i;
	public int count;
	
	public static void manu(String s1)
	{
char[] arr = s1.toCharArray();
		
		for ( int i = 0; i < arr.length; i++) 
		{
			int count=0;
			for (int j = 0; j <arr.length; j++) 
			{
				if (arr[i]==arr[j]) 
				{
					count++;
				}

			}
		System.out.println(arr[i]+" "+count);
		}
		
	}
	
	
	
}

