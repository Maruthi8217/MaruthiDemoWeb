package Test;

public class panic {
	static String rev;
	public static void main(String[] args) {
		String s1="hello java";
		String[] p1 = s1.split(" ");
		for (int i = 0; i < p1.length; i++)
		{
			String word=p1[i];
			for (int j =word.length()-1; j>=0; j--)
			{
            rev=rev+word.charAt(j);
			}	
		
		}


		System.out.println(rev);

	}
}
