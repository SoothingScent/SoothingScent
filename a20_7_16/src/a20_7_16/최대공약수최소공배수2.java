package a20_7_16;

import java.util.Scanner;

public class 최대공약수최소공배수2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, HIGH, LOW, R, L;
		System.out.println("1. 숫자 A를 입력하시오");
		A = sc.nextInt();
		System.out.println("2. 숫자 B를 입력하시오");
		B = sc.nextInt();
		R = 1;
		if (A > B) {
			HIGH = A;
			LOW = B;
		} else {
			LOW = A;
			HIGH = B;
		}

		while (R > 0) {
			R = HIGH % LOW;
			HIGH = LOW;
			LOW = R;
		}
		L = (A * B) / HIGH;
		System.out.println(HIGH + ", " + L);
	}

}
