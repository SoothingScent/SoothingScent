package a20_7_06;

import java.util.Scanner;

//�� 6�� �迭�� �޼ҵ�
public class ch06ex01 {
	public static void main(String[] args) {
		int b, c, d, e, f, g;
		int a[] = new int[10];
		a[0] = 10;// ��ġ
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
				System.out.println("���� : 0���� 9���̷� �Է��Ͻÿ�");
				continue;
			}
		}
	}
}
