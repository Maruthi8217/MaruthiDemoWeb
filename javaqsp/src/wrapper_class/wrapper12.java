package wrapper_class;

public class wrapper12 {
	public static void main(String[] args) {
		String s1="aprl11ty2023";
		char[] arr = s1.toCharArray();
		int num=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>=0 && arr[i]<=9)
			{
                System.out.println();
			}
			else
			{
				num=num+arr[i]; 
			}
			System.out.println(num);
		}
	}
}
