package InheritanceTest;

public class TL {

	public String pID;
	public String name;
	public String empID;
	
	public TL(String pID, String name, String empID) {
		super();
		this.pID = pID;
		this.name = name;
		this.empID = empID;
	}
	
	/*public String getpID() {
		return pID;
	}
	public void setpID(String pID) {
		this.pID = pID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	} */
	
	public void disp() {
		System.out.println("Team is working");
	}
	
}
