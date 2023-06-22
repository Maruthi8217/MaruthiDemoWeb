package programming;

import java.util.Scanner;

public class strong_number
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter");
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	while(temp!=0)
	{
		int rem=temp%10;
		int prod=1;
		for (int i=1; i <rem; i++) {
			
		
		prod=prod*i;
	}
		sum=sum+prod;
		temp=temp/10;
	}
	if (sum==num) {
		
		System.out.println("strong number");
	}
	else
	{
System.out.println("not strong number");
	}
}
}
