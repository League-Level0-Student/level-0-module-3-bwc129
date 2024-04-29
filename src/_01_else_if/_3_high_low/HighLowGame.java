
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
Random ranMaker = new Random();
		
		int ranNumber = ranMaker.nextInt(101);
		
		System.out.println(ranNumber);
		// 2. Print out the random variable above
		String ques =JOptionPane.showInputDialog("guess a number between 100 and 0");
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int quesAsInt=Integer.parseInt(ques);
			// 5. if the guess is correct
				
		if (ques.equals(ranNumber)) {
			String quest =JOptionPane.showInputDialog("you guessed it!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");}
		//if (ques>=ranNumber) {
			String questi =JOptionPane.showInputDialog("lower");}
		
		
		
		
		
		
		
		
		// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


