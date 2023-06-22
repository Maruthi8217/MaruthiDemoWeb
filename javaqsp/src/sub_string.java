
public class sub_string 
{
	public static void main(String[] args) 
	{
      String s1="maruthi";
     /* System.out.println(s1.substring(4));
      System.out.println(s1.substring(3));
      System.out.println(s1.substring(5));
      System.out.println(s1.substring(1));*/
      
    /*  String s2="karnataka";
      System.out.println(s2.substring(0,4));*/
      
 
     /* String s2="hello";
      System.out.println(s2.toUpperCase());*/
      
     /*String s2="JAVA";
     System.out.println(s2.toLowerCase());*/
      
      
     /* String s2="manu";
   
	s2=s2.substring(0, 1).toUpperCase()+s2.substring(1);
      
     System.out.println(s2); */
      
     /* String s4="hello";
      String rev="";
      char ch[]=s4.toCharArray();
      for (int i=ch.length-1; i>=0; i--)
      {
		rev=rev+ch[i];
	}
      System.out.println(rev);*/
      
      String s4="7april28";
      char ch[]=s4.toCharArray();
      String no="";
      String alp="";
      for (int i = 0; i < ch.length; i++)
      {
    	  if (Character.isAlphabetic(ch[i]))
    	  {
			no=no+ch[i];
		}
    	  else
    	  {
    		  alp=alp+ch[i];
    	  }
		
	}
      System.out.println(no);
		System.out.println(alp);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}
}
