import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	static Robot R2D2 = new Robot();

	public static void main(String[] args) {

		String shape = JOptionPane.showInputDialog(null,
				"Do you pick a triangle, square, or circle?(use lowercase...)");
		String color = JOptionPane.showInputDialog(null, "Do you pick black or blue?(Use lowercase again...)");
		R2D2.setSpeed(200);
		if (color.equals("blue")) {
			R2D2.setPenColor(000, 187, 153);
		}
		else if (color.equals("black")) {
			R2D2.setPenColor(0, 0, 0);
		}
		if (shape.equals("triangle")) {
			drawTriangle();
		}

		else if (shape.equals("square")) {
			drawsquare();
		} else if (shape.equals("circle")) {
			drawcircle();
		}

	}

	static void drawTriangle() {
		R2D2.penDown();
		for (int i = 0; i < 3; i++) {
			R2D2.turn(120);
			R2D2.move(300);
		}
	}

	static void drawsquare() {
		R2D2.penDown();
		for (int i = 0; i < 4; i++) {
			R2D2.turn(90);
			R2D2.move(300);
		}
	}

	static void drawcircle() {
		R2D2.penDown();
		for (int i = 0; i < 360; i++) {
			R2D2.turn(1);
			R2D2.move(1);
		}
	}
}
