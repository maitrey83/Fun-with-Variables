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
		
		
		println("This program converts fahrenheit to celsius");
		//int fahrenheit = 45;
		int fahrenheit = readInt("Enter Fahrenheit = ");
		int celsius = (fahrenheit - 32) * (5 / 9);
		println("Celsius is " + celsius + " degree");
	}
}
