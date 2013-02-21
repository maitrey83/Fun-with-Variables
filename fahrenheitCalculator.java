import acm.program.*;


public class fahrenheitCalculator extends ConsoleProgram {

	public void run () {
		int fahrenheit = 0;
		if (celsius(fahrenheit) > 10) {
			println("Yuppie this is summer");
		} else if (celsius(fahrenheit) < 0) {
		println("Ahhh still winter hasn't gone");
	} else {
		println("dont know yet");
	}
	}
		private int celsius(int fahrenheit) {
			int celsius = 0; 
			celsius = (fahrenheit - 32)*(5/9);
			return celsius;
		}	
		
}
