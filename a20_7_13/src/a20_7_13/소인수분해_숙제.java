package a20_7_13;

import java.util.Scanner;

public class 소인수분해_숙제 {
	public static void main(String[] args) {

		int S[] = new int[20];
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int K = 2;
		int C = 0;
		int Y = 1;

		N = sc.nextInt();
		do {
			if (N < 2) {
				System.out.println("Exit");
				break;
			}

			C = 0;
			do {
				K = 2;
				while (N % K != 0) {
					K = K + 1;
				}
				C = C + 1;
				S[C] = K;
				N = (int) N / K;

			} while (N != 1);

			if (C == 1) {
				System.out.println("소수");
			} else {
				for (Y = 1; Y <= C - 1; Y++) {
					System.out.print(S[Y] + " x ");
				}
				System.out.println(S[C]);
			}

		} while (true);
sc.close();
	}
}