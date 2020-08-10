package a20_7_21;

import java.util.Random;

public class ·£´ý·Î¶Ç {

	public static void main(String[] args) {
		Random r = new Random();
		int A[] = new int[6];
		int i = 0;
		for (i = 0; i <= 5; i++) {
			int Number = Math.abs(r.nextInt() % 45) + 1;
			A[i] = Number;
			for (int x = 0; x < i; x++) {
				if (A[i] == A[x])
					i--;
			}
		}
		for (i = 0; i <= 5; i++) {
			System.out.println(A[i]);
		}
	}
}
