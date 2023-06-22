package interface1;

public class driver  {

	public static void main(String[] args) {
		driver d1 = new driver();
		driver d2=new driver();
		System.out.println(d1.toString());
		System.out.println(d2.hashCode());
		System.out.println(d1.equals(d2));
		
		
	}

}


//hashcode:- it will return the object adress in the formante of number.

//toString() will be called implicitly.
//hashcoed() will be called explicitly.
//if equals method return true hascode will return same number.
//if the equals method is false hasecode will returns differnt numberr.
//purpose of overriding hashcode()
//





















































































































