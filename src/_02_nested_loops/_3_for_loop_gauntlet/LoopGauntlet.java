package _02_nested_loops._3_for_loop_gauntlet;

public class LoopGauntlet {
	public static void main(String[] args) {
//		for (int i = 0; i < 101; i++) {
//			System.out.println(i);
//		}
//		for (int b = 100; b > -1; b--) {
//			System.out.println(b);
//		}
//		for (int h = 1; h < 101; h++) {
//			if (h % 2 == 0) {
//				System.out.println(h + " is even!");
//			} else {
//				System.out.println(h + " is odd!");
//			}
//		}
//		for (int i1 = 2; i1 < 501; i1++) {
//			if (i1 % 2 == 0) {
//				System.out.println(i1 + " is even!");
//			} else {
//				System.out.println(i1 + " is odd!");
//			}
//		
//
//		}
//		int a = 7;
//		for (int g = 0; g < 111; g++) {
//			System.out.println(a);
//			a += 7;
//			
//		}
//		int year = 2008;
//		for (int j = 0; j < 13; j++) {
//			System.out.println("In " + year + " I was " + j);
//			year++;
//		}
//		int o = -1;
//		int p = 0;
//		for (int i = 0; i < 9; i++) {
//			
//			
//				if (i % 3 == 0) {
//					o++;	
//				}
//			
//			
//				p++;
//				if (p == 4) {
//					p = 1;
//				}
//			
//			System.out.println(o + " " + p);
//		}
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println("______________________________");
		int num = 1;
			for (int n = 1; n < 4; n++) {
				
				for (int m = 0; m < 3; m++) {
					System.out.print(num + " ");
					num++;
				}
				System.out.println("");
			}
			System.out.println("_____________________________");
			int numb = 1;
			for (int z = 1; z < 11; z++) {
				
				for (int s = 0; s < 10; s++) {
					System.out.print(numb + " ");
					numb++;
				}
				System.out.println("");
			}
			System.out.println("_____________________________");
			int numc = 1;
for (int z = 1; z < 7; z++) {
				
				for (int s = 0; s < numc; s++) {
					System.out.print("*");
					
				}
				numc++;
				System.out.println("");
			}
		}
		
	}

