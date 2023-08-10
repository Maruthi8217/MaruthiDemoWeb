
public class ThirdLargestNumber
{
	public static String rev;
	public static void main(String[] args) {
	String s1="hello java";
	String[] p1 = s1.split(" ");
	for (int i = 0; i < p1.length; i++) 
	{
		 rev="";
		for (int j =s1.length()-1; j>=0; j--)
		{
		rev=rev+s1.charAt(j);	
		}
	
	}
	
}
}
