package a20_7_16;

import java.util.Scanner;

public class �ִ������ּҰ����2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, HIGH, LOW, R, L;
		System.out.println("1. ���� A�� �Է��Ͻÿ�");
		A = sc.nextInt();
		System.out.println("2. ���� B�� �Է��Ͻÿ�");
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
