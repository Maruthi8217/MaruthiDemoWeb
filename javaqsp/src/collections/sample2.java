package collections;

import java.util.ArrayList;
import java.util.Collections;

public class sample2 {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(5);
	l1.add(30);
	l1.add(45);
	Collections.sort(l1);
System.out.println(l1);
}
}
