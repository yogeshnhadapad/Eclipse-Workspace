package HierarchicalTest;

public class HierarchicalMain {
	public static void main(String args[]) {
		
		SBI sbi = new SBI("abc",1);
		sbi.dispRateofIntrest();
		sbi.show();
		
		AXIS axis = new AXIS("xyz", 3);
		axis.show();
	}

}
