package programming;

public class polidrome {

	public static void main(String[] args)
	{
		String s="maruthi";
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
			
		{
			rev=rev+s.charAt(i);
			
		}
		if(s.equals(rev))
			
		{
			System.out.println(s +"is a polidrome");
		}
		else
		{
			System.out.println(s+"  is not a polidrome");
		}
			

	}

}
