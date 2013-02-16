import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public void run () {
		int fahrenheit = readInt ("Enter Fahrenheit =");
		int celsius = (fahrenheit - 32)*(5/9);
		println("Celsius is:"+ celsius);
	}
	
}
