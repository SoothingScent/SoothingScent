package a20_7_07;

import java.util.Scanner;

public class Algo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int A = sc.nextInt();
			int J = 2;
			if (A <= 1) {
				System.out.println("숫자를 다시 입력하시오");
				continue;
			}
			while (A % J != 0) {
				J++;
			}
			if (A == J)
				System.out.println("소수");
			else
				System.out.println("소수아님");
		}
	}
}