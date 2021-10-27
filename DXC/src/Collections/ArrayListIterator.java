package Collections;
import java.util.*;
import java.util.ArrayList;

public class ArrayListIterator {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Honey");
		list.add("chandu");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
