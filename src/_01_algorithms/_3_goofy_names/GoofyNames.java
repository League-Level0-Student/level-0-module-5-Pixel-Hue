package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
int c = 1;
		// 1. Ask the user to enter their name
String name = JOptionPane.showInputDialog("Enter your name below");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
System.out.println(name.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
for (int i = 0; i < name.length(); i++) {
	System.out.println(name.charAt(i));


			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
            String a = name.substring(i, i + 1);
            c = i;
            if (c % 2 == 0) {
            	a.toUpperCase();
            	
            }
            else {
            	a.toLowerCase();
            	
            }
          System.out.println(a);
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
        
			
			// 6. ADD this String  (containing 1 char) to the goofyName String

}
		// 7. Use pop-up to show user their Goofy name

	}
}

