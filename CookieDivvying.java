/* File: CookieDivvying.java
 * 
 * A program for distributing cookies equitably to children.
 */
import acm.program.*;

public class CookieDivvying extends ConsoleProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3532278711942220524L;

	public void run() {
		/* Everyone should see cookies! */
		setFont("DejaVuSerif-BOLD-24");
		
		/*int numCookies = readInt("How many cookies? ");
		int numKids    = readInt("How many kids?");
		
		int cookiesPerKid = numCookies / numKids;
		int cookiesForYou = numCookies % numKids;
		
		println("Cookies per kid: " + cookiesPerKid);
		println("Cookies for you: " + cookiesForYou);	*/
		
		int num1 = 32;
		double num2 = 0.56;
		println("This program converts fahrenheit to celsius");
		int celsius = (int) ((readInt("Enter Fahrenheit = ") - num1) * num2);
		println("Celsius is " + celsius + " degree");
	}
}
