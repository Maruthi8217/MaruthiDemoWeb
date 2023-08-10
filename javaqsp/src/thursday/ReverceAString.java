package thursday;

public class ReverceAString
{
	static String rev;
	public static void main(String[] args)
	{
		String s1="hello java";
		String[] s2 = s1.split(" ");
		for (int i = 0; i <=s2.length; i++)
		{
			for (int j =s1.length()-1; j>=0; j--)
			{
               rev=rev+s1.charAt(j);
              
			}
			
		
		}
		System.out.println(rev);
	}
}
