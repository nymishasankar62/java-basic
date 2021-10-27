package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Nymi");
		al.add("Harsha");
		al.add("Dolly");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
