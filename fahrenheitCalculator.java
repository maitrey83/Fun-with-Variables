import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public void run () {
		int celsius;
		if (celsius > 10) {
			println("Yuppie this is summer");
		} else if (celsius < 0) {
		println("Ahhh still winter hasn't gone");
	} else {
		println("dont know yet");
	}
		private int celsius(int fahrenheit) {
			int celsius = (fahrenheit - 32)*(5/9);
			return celsius;
		}	
}
