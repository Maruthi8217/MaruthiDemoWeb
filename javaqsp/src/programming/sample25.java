package programming;

public class sample25 {
public static void main(String[] args) {
/*	int[] arr= {1,2,3,4,5};
	int arr1= 0;
	
	
	for (int i =arr.length-1; i>=0; i--) 
	{
		
		arr1= arr[i];
		System.out.println(arr1);
	}*/
	
	int a[]= {1,2,3,4,5};
	int result[]=m(a);
	for (int i = 0; i < result.length; i++)
	{
	 System.out.println(result[i]+" ");	
	}
	

	 
}
public static int[] m(int a[])
{
	int i=0;
	int j=a.length-1;
	while(i<j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
}
	return a;
}
}
