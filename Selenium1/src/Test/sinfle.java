package Test;

public class sinfle {
public void book() {
	System.out.println("hello");
}
}

class mult extends sinfle
{
	public void note()
	{
	  System.out.println("byeee");	
	}
}

class mans extends mult
{
	public static void main(String[] args)
	{
	  mult s1 = new mult();	
	  s1.note();
	}
}