package score;

import java.util.Arrays;

public class descending_order {
public static void main(String[] args) {
	int[] arr= {10,70,42,98,12};
    Arrays.sort(arr);
    for (int i = arr.length-1; i>=0; i--) 
    {
	System.out.println(arr[i]);	
	}
}
}
