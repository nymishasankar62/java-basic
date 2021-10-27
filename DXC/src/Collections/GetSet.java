package Collections;

import java.util.ArrayList;

public class GetSet {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Grapes");
		System.out.println("Returning element: "+al.get(1));
		al.set(1, "Lichi");
		for(String fruits:al)
			System.out.println(fruits);
	}

}
