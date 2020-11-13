package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot c = new Robot("mini");
c.moveTo(400, 550);
c.penDown();
		//2. Set the speed to 100
c.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue", "Purple"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice == 0) {
			c.setPenColor(255, 0, 0);
		}
		if (colorChoice == 1) {
			c.setPenColor(0, 255, 0);
		}
		if (colorChoice == 2) {
			c.setPenColor(0, 0, 255);
		}
		if (colorChoice == 3) {
			c.setPenColor(150, 30, 255);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String a = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
		//5. Use the robot to draw the number of polygons the user requested.
		int v = Integer.parseInt(a);
		for (int i = 0; i < v; i++) {
		for (int n = 0; n < 4; n++) {
			c.penDown();
			c.move(20);
			c.turn(90);
			c.penUp();
		}
		c.move(20);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

