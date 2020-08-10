package a20_6_25;

public class TimesTaleFor2 {

	public static void main(String[] args) {
		for(int i = 1; i<=9; i++) {
			System.out.print( i + "´Ü: ");
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + " \t");
			}
			System.out.println();
		}
	}
}
