package wrapper_class;

public class wrapper 
{
	public static void main(String[] args) 
	{
       int a=10;
	   Integer s1=Integer.valueOf(a);
	   System.out.println(a);
	
		Integer a1=10;
		int b=a1.intValue();
		System.out.println(b);
		
		String s2="10";
		int p1 = Integer.parseInt(s2);
		System.out.println(p1+20);
		
	}
}


//in order to convert primitive values into non primmitive value  and non primitive itno primitive.

//datatype            wrapper class
//  byte                  byte
//short                   short
//int                      int
//long                    long
//float                   float
//char                    character
//boolean                 boolean

//boxing:-
//the process of converting primitive value into non-primitive value is known as boxing

//unboxing:the process of converting non primitive value into primitive value.