package ExeceptionHandling;


public class ExceptionTest {

	public static void validateAge(int age) throws InvalidAgeException{
		if(age<18) {
			
		throw new InvalidAgeException("Age is not valid");
		}
		else {
			System.out.println("Welcome to voting");
		}
	}
	
	public static void main(String args[] ){
		
		try {
			ExceptionTest.validateAge(25);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
}
