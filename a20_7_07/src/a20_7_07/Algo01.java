package a20_7_07;

import java.util.Scanner;

public class Algo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int A = sc.nextInt();
			int J = 2;
			if (A <= 1) {
				System.out.println("���ڸ� �ٽ� �Է��Ͻÿ�");
				continue;
			}
			while (A % J != 0) {
				J++;
			}
			if (A == J)
				System.out.println("�Ҽ�");
			else
				System.out.println("�Ҽ��ƴ�");
		}
	}
}