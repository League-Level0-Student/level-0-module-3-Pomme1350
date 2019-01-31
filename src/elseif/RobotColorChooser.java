//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		// 1. Create a new Robot
		Robot R2D2 = new Robot();
		for(int i=0;i<10; i++) {
		// 3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(null, "What color do you want your robot to be?");

		// 5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("Blue")) {
			R2D2.setPenColor(51, 181, 255);
		} else if (color.equals("Red")) {
			R2D2.setPenColor(255, 94, 94);
		}

		else if (color.equals("Yellow")) {
			R2D2.setPenColor(255, 255, 105);
		}
		
	

	// 6. If the user doesn’t enter anything, choose a random color
		else {
			R2D2.setRandomPenColor();
		}
		R2D2.setPenWidth(10);
		R2D2.penDown();
		R2D2.move(100);
		R2D2.turn(90);
	// 7. Put a loop around your code so that you keep asking the user for more
	// colors & drawing them

	// 4. Set the pen width to 10

	// 2. Make the robot draw a shape (this will take more than one line of code)

}
}
}
