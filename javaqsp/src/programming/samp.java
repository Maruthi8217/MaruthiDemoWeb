package programming;

import java.util.Scanner;

public class samp
{
public static void main(String[] args) 
{
  Scanner sc = new Scanner(System.in);
  System.out.println("enter");
	int a = sc.nextInt();
	boolean flag=true;
	for (int i = 2; i <7; i++)
	{
	  if (a%2==0) {
		flag=false;
	}	
	}
	if(flag==true)
	{
		System.out.println("prime");
	}
	else {
		System.out.println("composite");
	}
	
}
}
