package interface1;

public class manu implements a,b {

	@Override
	public void m1() {
		System.out.println("method 1");
	}

	@Override
	public void m2() {
		System.out.println("method 2");
	}
	
	public static void main(String[] args) {
		 a q=new manu();
		 q.m2();
		 
		 
	}

}
