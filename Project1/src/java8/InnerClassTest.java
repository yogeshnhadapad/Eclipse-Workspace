package java8;

public class InnerClassTest {
	public static void main(String args[]) {
		
		CPU cpu = new CPU();
		CPU.Processor p = cpu.new Processor();
		
	}
}
	 class CPU{
		double price;
		
		class Processor{
			double core;
			String manufacture;
			
			public double getCache() {
				return 1.1;
			}
		}
		
		protected class RAM{
			double memory;
			String manufacture;
			
			double getClockSpeed() {
				return 5.1;
			}
		}
	}


