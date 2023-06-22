package Abstraction;

public  class c extends b
{
void m2()
{
	System.out.println("method 2");
	
}
void m1()
{
	System.out.println("method 3");
}
public static void main(String[] args) {
	b b1=new c();
	b1.m2();
	b1.m1();
	
}
}
