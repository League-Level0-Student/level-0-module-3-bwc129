
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		String hi =JOptionPane.showInputDialog("What color would you like. Red. Green. Blue.");
		
		if (hi.equals("red")) {
		
		rob.setPenColor(Color.red);}
		
		if (hi.equals("blue")) {
			
			rob.setPenColor(Color.blue);}
		
		
		if (hi.equals("green")) {
			
			rob.setPenColor(Color.green);}
		
		
		
		
		
		
		
		
		
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(2000000);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(180);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(-90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(180);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(270);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(180);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(-90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.move(180);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(-90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(180);
		rob.move(180);
		rob.turn(-90);
		rob.move(90);
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
