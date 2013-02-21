import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public  void run () {
		println("Celsius: " + celsius(100));
	}
		private int celsius(int fahrenheit) {
			double celsius = ((fahrenheit - 32))*(5/9);
			return (int) celsius;
		}	
	
}
