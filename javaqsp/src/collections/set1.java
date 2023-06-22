package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class set1
{
public static void main(String[] args)
{
/*HashSet h1=new HashSet();
h1.add(10);
h1.add(true);
h1.add("java");
h1.add(10);
System.out.println(h1);
System.out.println(h1);*/
	
	/*ArrayList a1=new ArrayList();
a1.add(10);
a1.add(20);
a1.add(10);
HashSet h1=new HashSet(a1);
System.out.println(h1);
*/
	TreeSet t1=new TreeSet();
	t1.add(10);
	t1.add(30);
	t1.add(30);
	System.out.println(t1);
	
	//to print the output in descending order
	
	/*Iterator i1 = t1.descendingIterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	*/
	/*LinkedHashSet l1=new LinkedHashSet();
	l1.add(10);
	l1.add(20);
	l1.add(true);
	l1.add("manu");
	System.out.println(l1);
	*/
	PriorityQueue p1=new PriorityQueue<>();
	p1.add(10);
	p1.add(20);
	p1.add(50);
	p1.add(5);
	System.out.println(p1);
	while(!p1.isEmpty())
	{
		System.out.println(p1.poll());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
