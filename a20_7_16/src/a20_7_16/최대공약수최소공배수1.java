package a20_7_16;

import java.util.Scanner;

public class �ִ������ּҰ����1 {
	public static void main(String[] args) {
		int A, B, BIG, SMALL, NMG;
		int GCM, LCM;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� A�� �Է��Ͻÿ�");
		A = sc.nextInt();
		System.out.println("���� B�� �Է��Ͻÿ�");
		B = sc.nextInt();
		BIG = (A >= B) ? A : B;
		SMALL = (A >= B) ? B : A;
		do {
			NMG = BIG % SMALL;
			if (NMG == 0) {
				GCM = SMALL;
				LCM = A * B / GCM;
				System.out.println("�ִ����� = " + GCM + ", " + "�ּҰ���� = " + LCM);
				break;
			} else {
				BIG = SMALL;
				SMALL = NMG;
			}
		} while (SMALL == NMG);
	}
}
