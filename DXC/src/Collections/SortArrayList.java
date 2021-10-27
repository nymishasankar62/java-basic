package Collections;
import java.util.*;
import java.util.List;

public class SortArrayList {
	public static void main(String args[]) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Mango");
		l1.add("Grapes");
		l1.add("Apple");
		Collections.sort(l1);
		for(String fruit:l1)
			System.out.println(fruit);
		System.out.println("Sorting numbers");
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(21);
		l2.add(11);
		l2.add(51);
		Collections.sort(l2);
		for(Integer number:l2)
			System.out.println(number);
	}

}
  