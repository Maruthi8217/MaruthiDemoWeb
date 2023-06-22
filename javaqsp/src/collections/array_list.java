package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class array_list 
{
public static void main(String[] args) 
{
/*ArrayList a1 = new ArrayList<>();
a1.add(10);
a1.add(20);
a1.add(30);
a1.add(40);
a1.add(50);
a1.add(60);*/
/*System.out.println(a1.get(0));
for (int i = 0; i <a1.size(); i++)
{
System.out.println(a1.get(i));	
}
System.out.println(a1);
System.out.println(a1.size());
a1.remove(0);
System.out.println(a1);
a1.add(1,123.1);
a1.set(1,78.9);
for(Object s1:a1)
{
	System.out.println(s1);
}*/
/*ArrayList a2=new ArrayList();
a2.add(10);
a2.add(20);
a2.add(30);
a2.removeAll(a1);

System.out.println(a1);
System.out.println(a2);

a1.retainAll(a2);
System.out.println(a1);
System.out.println(a2);
*/
/*ArrayList<Integer> l1=new ArrayList();

l1.add(10);
l1.add(20);
for(Integer sun:l1)
{
	System.out.println(l1.contains(10));
}
*/
	
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	ListIterator i=l1.listIterator(l1.size());
	while(i.hasPrevious())
	{
		System.out.println(i.previous());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
