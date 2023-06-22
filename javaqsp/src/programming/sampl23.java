package programming;

import java.util.Scanner;

public class sampl23
{
   public static void main(String[] args) 
	  {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int range = sc.nextInt();
       int sum=0;
       for (int i =1; i <=range; i++) 
       {
		 if (isprime(i)==true) {
			sum=sum+i;
		}
	   }
       System.out.println(sum);
	  }
   
   public static boolean isprime(int num)
   {
	   if (num==1) {
		return false;
	}
	   for (int i =2; i<=num/2; i++) {
		   if (num%i==0) {
			return true;
		}
		
	}
	return true;
   }
}




