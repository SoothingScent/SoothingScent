package a20_7_16;

import java.util.Scanner;

public class 최대공약수최소공배수1 {
	public static void main(String[] args) {
		int A, B, BIG, SMALL, NMG;
		int GCM, LCM;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 A를 입력하시오");
		A = sc.nextInt();
		System.out.println("숫자 B를 입력하시오");
		B = sc.nextInt();
		BIG = (A >= B) ? A : B;
		SMALL = (A >= B) ? B : A;
		do {
			NMG = BIG % SMALL;
			if (NMG == 0) {
				GCM = SMALL;
				LCM = A * B / GCM;
				System.out.println("최대공약수 = " + GCM + ", " + "최소공배수 = " + LCM);
				break;
			} else {
				BIG = SMALL;
				SMALL = NMG;
			}
		} while (SMALL == NMG);
	}
}
