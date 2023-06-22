package collections;

import java.util.LinkedList;

public class linked 
{
public static void main(String[] args) 
{
 LinkedList l1=new LinkedList();	
 l1.add(10);
 l1.add(20);
 l1.add(50);
 System.out.println(l1);
 l1.addFirst(100);
 l1.addLast(3000);
 System.out.println(l1);
 System.out.println(l1.getFirst());
 System.out.println(l1.getLast());
 l1.removeLast();
 System.out.println(l1);
 
 
}
}
