package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayListClass {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("raj");
		list.add("venu");
		list.add("gaja");
		list.add("rohan");
		
		Stream<String> s = list.stream();
		Stream<String> s1 = list.parallelStream();
		
		int[] arr = {1,2,3,4};
		
		// Intstream is a class of stream interface it represent the stream of primitive int valued element
		IntStream s3 = Arrays.stream(arr);
		
		
		//it add mandatory values
		// that will return sequentional string containing single specified element
		s = Stream.of("orange");
		
		
		//filter
		ArrayList<String> list1 = new ArrayList<>();
		list.add("raj");
		list.add("venu");
		list.add("gaja");
		list.add("rohan");
		List<>
		
		
		
		
		
		
		
		}

}