import acm.program.*;

//Fahrenheit Method
public class fahrenheitCalculator extends ConsoleProgram {
	private static final int value2 = 32;
	private static final double value1 = 0.55;
	public  void run () {
		//user enters fahrenheit temperature
		int fahrenheit = readInt("Fahrenheit: ");
		//The copy of variable fahrenheit is being transferred to method called Cels(fahrenheit)
		println("Celsius: " + cels(fahrenheit));
		//using if control statement it determines the current temperature
		if (cels(fahrenheit) > 0){
			println("Yuppie Summer is back!!!");
		} if (cels(fahrenheit) == 0){
			println("it's freezing!!!");
		} if(cels(fahrenheit) < 0) {
			println("It can snow anytime");
		}
	}
	//created Method or function for converting fahrenheit to celsius
	private int cels(int fahrenheit) {
			//equation celsius = (fahrenheit - 32)*(5/9)
			int celsius = (int) ((fahrenheit - value2)*value1);
			return celsius;	
		}	
			 
}
