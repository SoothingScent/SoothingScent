package a20_7_17;

import java.util.Scanner;

public class 진법변환1_10진수를2진수로 {
	public static void main(String[] args) {
		int MOK, NMG, i;
		int B[] = new int[10];
		int S = 0;
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		do {
			MOK = D / 2;
			NMG = D - MOK * 2;
			B[S] = NMG;
			S++;
			D = MOK;
		} while (MOK != 0);
		for (i = S - 1; i >= 0; i--) {
			System.out.print(B[i] + "");
		}
		System.out.println("EXIT");
	}
}
