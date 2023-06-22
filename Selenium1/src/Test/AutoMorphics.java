package Test;

import java.util.Scanner;

public class AutoMorphics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give a number to find automorphic");
		int Value=sc.nextInt();

		int number=Value;
		int square=number*number;

		int morphics=square%10;
		if(number==morphics)
		{
			System.out.println("The number "+Value+" square value is "+square+" its is automorphic number");
		}
		else
		{
			System.out.println("its not a automorphic number");
		}




	}

}
