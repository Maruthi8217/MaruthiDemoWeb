package Exception_handling;
public class a {
public static void main(String[] args) {
	System.out.println(10);
System.out.println(20);
try
{
System.out.println(10/0);
}
catch(Exception e)
{
	System.out.println("handled");
}
finally
{
	System.out.println("executed");
}
}
}
//whren ever we are using try with multiple catch in first catch block if we are writing super class and then we are using sub class in the rest of the catch block then we will get complie time wxception
//even if there is error or not in the code finally blockl will be executed in the all the condtion
