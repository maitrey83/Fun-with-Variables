import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public  void run () {
		int celsius = readInt("Celsius: ");
	}
		private int celsius(int fahrenheit) {
			double value1 = 0.54;
			double value2 = 32;
			double celsius = (fahrenheit - value2)*value1;
			return (int) celsius;
		}	
	
}
