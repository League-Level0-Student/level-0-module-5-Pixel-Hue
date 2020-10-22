package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String a;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		a = JOptionPane.showInputDialog("What kind of pet would you like to buy? (Dog or Cat)");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 16; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you want to do with your pet?", "Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "Water", "Cuddle", "Groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task == 0) {
	Food();
}
else if (task == 1) {
	Water();
}
else if (task == 2) {
	Cuddle();
}
else if (task == 3) {
	Groom();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel >= 15) {
	JOptionPane.showMessageDialog(null, "You love your pet!");
	break;
}
		}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
public static void Food() {
	if (a.equalsIgnoreCase("dog")) {
		JOptionPane.showMessageDialog(null, "Your dog ate the food!");
		happinessLevel += 2;
	}
	else if (a.equalsIgnoreCase("cat")) {
	JOptionPane.showMessageDialog(null, "Your cat ate the food!");
	happinessLevel += 2;
	}
	else {
		JOptionPane.showMessageDialog(null, "Your animal ate the food!");
		happinessLevel += 2;
	}
}
public static void Water() {
	if (a.equalsIgnoreCase("dog")) {
		JOptionPane.showMessageDialog(null, "Your dog drank the water!");
		happinessLevel += 1;
	}
	else if (a.equalsIgnoreCase("cat")) {
	JOptionPane.showMessageDialog(null, "Your cat drank the water!");
	happinessLevel += 1;
	}
	else {
		JOptionPane.showMessageDialog(null, "Your animal drank the water!");
		happinessLevel += 1;
	}
}
public static void Cuddle() {
	if (a.equalsIgnoreCase("dog")) {
		JOptionPane.showMessageDialog(null, "You cuddled your dog!");
		happinessLevel += 3;
	}
	else if (a.equalsIgnoreCase("cat")) {
	JOptionPane.showMessageDialog(null, "You cuddled your cat!");
	happinessLevel += 2;
	}
	else {
		JOptionPane.showMessageDialog(null, "You cuddled your animal!");
		happinessLevel += 2;
	}
}
public static void Groom() {
	if (a.equalsIgnoreCase("dog")) {
		JOptionPane.showMessageDialog(null, "Your dog got groomed!");
		happinessLevel += 2;
	}
	else if (a.equalsIgnoreCase("cat")) {
	JOptionPane.showMessageDialog(null, "Your cat got groomed!");
	happinessLevel += 1;
	}
	else {
		JOptionPane.showMessageDialog(null, "Your animal got groomed!");
		happinessLevel += 3;
	}
}}
