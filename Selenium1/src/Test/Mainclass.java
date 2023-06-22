package Test;

class Sel 
{
	public void what1()
	{
		System.out.println("message");
	}
}

class Selenium extends Sel
{
	public void what1() 
	{
		System.out.println("calls");	 
	}
}

class Mainclass extends Selenium
{
	
	public static void main(String[] args) {
		Selenium s1 = new Selenium();
		s1.what1();
	}
}





