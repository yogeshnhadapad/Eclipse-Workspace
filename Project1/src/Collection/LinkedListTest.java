package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String args[]) {
		
		LinkedList<String> list = new LinkedList();
		list.add("yogi");
		list.add("mahi");
		list.add("chetan");
		
		System.out.println("LinedList is" + list);
		
		ArrayList<String> arraylist = new ArrayList();
		arraylist.add("pen");
		arraylist.add("book");
		arraylist.add("pencil");
		
		System.out.println("ArrayList is" + arraylist);
		
		System.out.println("Combind list and array ");
		
		list.addAll(arraylist);
		
		System.out.println(list);
		
		list.remove(arraylist);
		System.out.println(list);
	
		
		
	}
}
