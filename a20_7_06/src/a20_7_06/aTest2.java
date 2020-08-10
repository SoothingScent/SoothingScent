package a20_7_06;

public class aTest2 {
	public static void main(String[] args) {
		int a, b;
		for (a = 1; a <= 8; a++) {
			for (b = 1; b <= a; b++) {
				if (b <= 5)
					System.out.print("*");
				else
					break;
			}
			System.out.println();
		}
	}
}
