import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

import interface1.e;

public class RemoveDuplicateValues 
{
	public static void main(String[] args) 
	{
		int[] numbers = {1, 2, 3, 4, 2, 5, 6, 1, 3};
		TreeSet Duplicate = new TreeSet<>();
        Duplicate.add(numbers);
        System.out.println(Duplicate);
	}
}
