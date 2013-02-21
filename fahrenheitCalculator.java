import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public  void run () {
		println("Celsius " + celsius(32));
	}
		private int celsius(int fahrenheit) {
			int celsius = (fahrenheit - 32)*(5/9);
			return celsius;
		}	
	
}
