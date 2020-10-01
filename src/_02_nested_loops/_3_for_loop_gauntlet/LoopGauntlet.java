package _02_nested_loops._3_for_loop_gauntlet;

public class LoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even!");
			}else {
				System.out.println(i + " is odd!");
			}
			for (int i1 = 2; i1 < 501; i1++) {
				if (i1 % 2 == 0) {
					System.out.println(i1 + " is even!");
				}else {
					System.out.println(i1 + " is odd!");
				}
				int a = 7;
			for (int g = 0; g < 111;g++) {
				System.out.println(a);
				a += 7;
			}
				
			
		
		}
	}
}
}