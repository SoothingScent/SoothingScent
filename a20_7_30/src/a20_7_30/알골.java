package a20_7_30;

import java.util.Scanner;

public class 알골 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int h = 10;
		int k;
		int l = 1;
		int m = 0;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		do {

			if (l > h) {
				System.out.println("값이 없음");
				break;
			} else {
				m = (l + h) / 2;
				if (k == a[m]) {
					System.out.println(m);
					break;
				} else {
					if (k < a[m])
						h = m - 1;
					else
						l = m + 1;
				}
			}
		} while (true);

	}
}
