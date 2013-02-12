/* File: MusicalJava.java
 * 
 * A program that displays the lyrics to a popular long.
 */
import acm.program.*;

public class MusicalJava extends ConsoleProgram {
	public void run() {
		/* So you can know what I'm sayin'. */
		setFont("DejaVuSerif-BOLD-24");
		
		println("Oppan Gangnam Style");
		for (int i = 0; i < 2; i++) {
			println("Gangnam Style");
			
			for (int j = 0; j < 4; j++) {
				println("Op");
			}
			
			println("Oppan Gangnam Style");
		}
	}
}
