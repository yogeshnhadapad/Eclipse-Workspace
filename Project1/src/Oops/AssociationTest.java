package Oops;

public class AssociationTest {
	
	public static void main(String args[]) {
		
		Employe employe = new Employe();
		employe.setEmployeName("raj");
		
		Bank bank = new Bank();
		bank.setBankName("sbi");
		
		System.out.println(employe.getEmployeName()+ " " + "is working in " + " " + bank.getBankName());
		
	}
	

}
