package programming;

public class arm_strong_number {
	public static void main(String[] args) {
		int no=153;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		System.out.println(sum);

		if (sum==no) 
		{
			System.out.println("arm strong number");
		} else 
		{
			System.out.println("not arm strong number");
		}
	}
}
