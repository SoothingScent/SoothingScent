package a20_7_23;

import java.util.Scanner;

public class 오름차순정렬 {
	public static void main(String[] args) {
		int A[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int i, j, Temp;
		for (i = 0; i < 5; i++) {
			A[i] = sc.nextInt();
		}
		for (i = 0; i < 4; i++) {
			for (j = i + 1; j < 5; j++) {
				if (A[i] > A[j]) {
					Temp = A[i];
					A[i] = A[j];
					A[j] = Temp;
				}
			}
		}
		for (i = 0; i < 5; i++) {
			System.out.println(A[i]);
		}
	}
}
