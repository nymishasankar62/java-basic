package Collections;

import java.util.ArrayList;

public class IterartorForEachLoop {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		for(String fruit:list)
			System.out.println(fruit);
	}

}
