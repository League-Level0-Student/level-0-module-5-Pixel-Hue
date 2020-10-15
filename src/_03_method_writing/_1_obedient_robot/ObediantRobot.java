package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {

	public static void main(String[] args) {
		Robot hello = new Robot("mini");
		hello.setSpeed(100);
		hello.penDown();
String a = JOptionPane.showInputDialog("What shape do you want to draw? (Square or Triangle)");
String b = JOptionPane.showInputDialog("What color do you want? (Red, Green, Blue)");
if (b.equalsIgnoreCase("red")) {
	hello.setPenColor(255, 0, 0);
}
if (b.equalsIgnoreCase("blue")) {
	hello.setPenColor(0, 0, 255);
}
if (b.equalsIgnoreCase("green")) {
	hello.setPenColor(0, 255, 0);
}
if (a.equalsIgnoreCase("Square")) {
	drawSquare(hello);
}
else {
	drawTriangle(hello);
}
		
	}

	private static void fill(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

	public static void drawSquare(Robot x) {
		for (int i = 0; i < 45; i++) {
			x.move(i);
			x.turn(90);
		}
		x.setPenColor(0, 0, 0);
		x.move(45);
		x.turn(90);
		x.move(45);
		x.turn(90);
		x.move(45);
		x.turn(90);
		x.move(45);
		x.turn(90);
		x.penUp();
		x.move(145);
	}
	public static void drawTriangle(Robot x) {
		x.turn(90);
		for (int i = 0; i < 3; i++) {
			x.move(90);
			x.turn(120);
			
		}
		x.penUp();
		x.move(145);
	}
}