package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
 String b = JOptionPane.showInputDialog("How many dimes do you have?");
int a = Integer.parseInt(b);


		// Tell them how many cents they have (hint multiply by 10)
a *= 10;
JOptionPane.showMessageDialog(null, "You have " + a + " dimes");



		// Ask the user how tall they are (inches)
String c = JOptionPane.showInputDialog("How many inches are you?");
int d = Integer.parseInt(c);

if (d <= 36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
}
		// If they are shorter than 36 inches, tell them to eat their Wheaties




		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for (int i = 1; i < 31; i++) {
	if (i % 3 == 0) {
		System.out.println(i);
	}
}






		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 
Random ran = new Random();
int a = ran.nextInt(20);
Random an = new Random();
int b = an.nextInt(10);
System.out.println(a);
System.out.println(b);
a -= b;

		// Get another random number that is less than 10 and print it to the console 

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, a);


		}

		void skill4() { // In a pop-up, ask the user for the city they live in 
String city = JOptionPane.showInputDialog("What city do you live in?");
if (city.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego");
}
		// If they answered "San Diego", tell them they live in America's Finest City 



		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars = 2;
if (cars == 0) {
	System.out.println("I  bet you use public transportation");
}
else if (cars == 1) {
	System.out.println("Ski-Doo GRAND TOURING LE 4-TEC 1200");
}
else if (cars <= 2) {
	cars *= 4;
	System.out.println(cars);
}
		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



		}

		void skill5() { // In a pop-up, ask the user for the name of their school 
String school = JOptionPane.showInputDialog("What's the name of your school");
JOptionPane.showMessageDialog(null, school + " is a fantastic school!");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



		}
		}


