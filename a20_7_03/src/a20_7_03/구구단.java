package a20_7_03;

public class ±¸±¸´Ü {
	public static void main(String[] args) {
		int dan, n;
		for (n = 1; n <= 9; n++) {
			for (dan = 1; dan <= 3; dan++) {
				System.out.print(dan + " * " + n + " = " + dan * n + "\t" + "\t");
				if (dan == 3)
					System.out.println();
			}

			if (dan == 3)
				System.out.println();
		}
		for (n = 1; n <= 9; n++) {
			for (dan = 4; dan <= 6; dan++) {
				System.out.print(dan + " * " + n + " = " + dan * n + "\t" + "\t");
				if (dan == 6)
					System.out.println();
			}
			if (dan == 6)
				System.out.println();
		}
		for (n = 1; n <= 9; n++) {
			for (dan = 7; dan <= 9; dan++) {
				System.out.print(dan + " * " + n + " = " + dan * n + "\t" + "\t");
				if (dan == 9)
					System.out.println();
			}
		}
	}
}
