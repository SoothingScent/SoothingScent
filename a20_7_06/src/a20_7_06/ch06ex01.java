package a20_7_06;

import java.util.Scanner;

//제 6장 배열과 메소드
public class ch06ex01 {
	public static void main(String[] args) {
		int b, c, d, e, f, g;
		int a[] = new int[10];
		a[0] = 10;// 위치
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		a[7] = 80;
		a[8] = 90;
		a[9] = 100;
		Scanner sc = new Scanner(System.in);
		int i;
		for (;;) {
			i = sc.nextInt();
			if (i <= 9)
				System.out.println(a[i]);
			else {
				System.out.println("에러 : 0부터 9사이로 입력하시오");
				continue;
			}
		}
	}
}
