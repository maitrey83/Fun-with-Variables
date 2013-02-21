import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public  void run () {
		int fahrenheit = 100;
		println("Celsius " + celsius(fahrenheit));
	}
		private int celsius(int fahrenheit) {
			int celsius = (fahrenheit - 32)*(5/9);
			return celsius;
		}	
	
}
