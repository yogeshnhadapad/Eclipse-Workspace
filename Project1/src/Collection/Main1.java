package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main1 {
	public static void main(String args[]) {
		LinkedHashSet<Employee> employee = new LinkedHashSet();
		employee.add(new Employee("yogesh",101,"karnata"));
		
		employee.add(new Employee("chetan",102,"Pune"));
		employee.add(new Employee("sagar",103,"solapur"));
		
		employee.stream().forEach(System.out::println); 
		
//		Iterator<Employee> it = employee.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

}

  ArrayList<Integer> arraylist = new ArrayList<>();
  arraylist.add(1);
  arraylist.add(2);
  arraylist.add(3);
  arraylist.add(4);
  arraylist.add(4);
  
 HashSet<Integer> hashset = new HashSet<>();
 hashset.addAll(arraylist);
 
  
  
  
  
  