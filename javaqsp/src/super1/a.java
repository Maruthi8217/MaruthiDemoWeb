package super1;

public class a
{
String ename;
double salary;
int empno;
public a(String ename,double salary,int empno)
  {
   this.ename=ename;
   this.salary=salary;
   this.empno=empno;
   }
     public String tostString() 
     {
     return  "employee name"+this.ename;
     }
   
    public static void main(String[] args) {
	a a1=new a("rahul", 39000, 1);
	System.out.println(a1);
	
}


}
//object class is a supermost class in java

//1.to string(), 2.equals(), 3.hashcode()

//to string method will belongs to object class it is amethod that whenever we print object refrence implicitly tostring() will be called and it will return address in string 

