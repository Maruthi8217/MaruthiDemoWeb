package interface1;

public class e extends INTER{
public void m() {
	System.out.println("method 2");
}
public static void main(String[] args) {
	INTER N1=new INTER();
	N1.m();
	//we cannot create object for interface
	//we cannot have constructor in interface
	//interface doesen't extends the object class
	//after compilation every method should be public abastract
	//the defaut acess specifer in interface is public
    //in order to interface to interface we use extends

}
}
