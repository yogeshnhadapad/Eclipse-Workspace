package tcsjavaDayOne;

public class StaticBinding {
	void add(int x, int y) 
	{ 
	    int sum = x + y; 
	    System.out.println("Sum of two numbers: " +sum); 
	} 
	void add(int x, int y, int z) 
	{ 
	    int sum = x + y + z; 
	    System.out.println("Sum of three numbers: " +sum); 
	} 
	public static void main(String[] args) 
	{ 
		StaticBinding a = new StaticBinding(); 
	    a.add(10, 20); // Calling add() method by passing two argument values. 
	    a.add(20, 30, 40); // Calling add() method by passing three argument values. 
	 } 

}
