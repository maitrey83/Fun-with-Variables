/*
 * File: VeryMeanProgram.java
 * -----------------------
 * A program that computes and displays averages.
 */

import acm.program.*;

public class VeryMeanProgram extends ConsoleProgram {
	public void run() {	
		/* So all y'all in the back can see! */
		setFont("DejaVuSerif-BOLD-24");
		
		int firstNum =  readInt("Enter a number: ");
		int secondNum = readInt("Enter another number: ");
		
		double average = (firstNum + secondNum) / 2.0;
		println("The average is " + average + ".");
	}
}

