package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String A = JOptionPane.showInputDialog("Type in a whole number");
	int b = Integer.parseInt(A);
	boolean a = false;
	for (int i = 2; i < b; i++) {
	if (b % i == 0) {
		System.out.println("not prime");
		a = true;
	}
	
	
}
	if (a == false) {
		System.out.println("prime");
	}
	
}
}