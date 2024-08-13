package tcsjavaDayOne;

public class Lion {
 //non-static method
	private void eat() 
	{ 
	   System.out.println("Lion eats flesh"); 
	} 
	//static method
	static void live() 
	{ 
	   System.out.println("Lion lives in Jungle"); 
	} 
	public static void main(String[] args) 
	{ 
	   Lion l = new Lion(); 
	   //calling non-static method with object
	   l.eat(); 
	 //calling static method with class name
	   Lion.live(); 
	 } 
}
