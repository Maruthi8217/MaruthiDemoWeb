package programming;

public class ststicblock {
	static int a=10;
static
{
	a=20;
	ststicblock.a=ststicblock.a+a;
	System.out.println(a);
}
static
{
	int b=20;
	a=a+b;
}

public static void main(String[] args) 
{
	System.out.println(a);
}
}
