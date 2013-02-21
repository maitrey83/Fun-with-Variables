import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public  void run () {
		int celsius = readInt("Fahrenheit: ");
		println("Celsius: " + cels(celsius));
	}
		private int cels(double celsius2) {
			double value1 = 0.54;
			double value2 = 32;
			double celsius = (celsius2 - value2)*value1;
			return celsius;	
		}	
			 
}
