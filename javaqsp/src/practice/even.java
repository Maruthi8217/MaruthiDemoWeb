package practice;

import java.util.Scanner;

public class even
{
public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 int no = sc.nextInt();
 System.out.println("enter the range");
 
 int range = sc.nextInt();
 
	for (int i = no; i <=range; i++) {
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
}
