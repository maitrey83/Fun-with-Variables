import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public  void run () {
		int celsius = readInt("Fahrenheit: ");
		int fahrenheit = 0;
		println("Celsius: " + cels(fahrenheit));
	}
		private int cels(int fahrenheit) {
			double value1 = 0.54;
			double value2 = 32;
			int celsius = (int) ((fahrenheit - value2)*value1);
			return celsius;	
		}	
			 
}
