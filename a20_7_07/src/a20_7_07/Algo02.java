package a20_7_07;

import java.util.Scanner;

public class Algo02 {
	public static void main(String[] args) {
		int A[] = new int[100];
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int C = 0, D = 0;
		while (C <= B) {
			C++;
			if (B % C == 0) {
				A[D] = C;
				D++;
			}
		}
		for (int i = 0; i < D; i++) {
			System.out.println(A[i]);
		}
	}
}
