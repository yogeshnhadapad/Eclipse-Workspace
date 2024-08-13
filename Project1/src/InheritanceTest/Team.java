package InheritanceTest;

public class Team extends TL{

	public String Tname;
	public String Pname;
	public int NoofDays;
	
	public Team(String pID, String name, String empID, String tname, String pname, int noofDays) {
		super(pID, name, empID);
		Tname = tname;
		Pname = pname;
		NoofDays = noofDays;
	}
	
	@Override
	public void disp() {
		System.out.println("work completed");
		
	}
	
}
