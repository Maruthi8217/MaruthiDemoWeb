package practice;

public class duplcate {
public static void main(String[] args) {
	int arr[]= {10,45,78,10};
	int arr1[]= {};
	for (int i = 0; i < arr.length; i++) 
	{
	for (int j = 1; j < arr.length; j++)
	{
	  if(arr[i]!=arr[j])
	  {
		  arr1[j]=arr[i];
	  }
	}	
	}
}
}
