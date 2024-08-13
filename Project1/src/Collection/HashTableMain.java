package Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableMain {
	public static void main(String args[]) {
		
	
	Hashtable<Integer,String> ht = new Hashtable<>();

	ht.put(100,"Amit");
	ht.put(101,"Avi");
	ht.put(102,"Raj");
	
	Enumeration<Integer> E = ht.keys();
	while(E.hasMoreElements()) {
		int f = E.nextElement();
		System.out.println("Enumeration data is"+f);
	}
	
}
}