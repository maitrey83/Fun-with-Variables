import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public void run () {
		int fahrenheit = readInt ("Enter Fahrenheit =");
		int celsius = fahrenheit - 32;
		int celsius = (int) (celsius * 0.56);
		println("Celsius is:"+ celsius);
	}
	
}
