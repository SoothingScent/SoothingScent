package a20_7_06;

import java.util.Scanner;

/*a�迭�� ��ĳ�ʸ� �̿��Ͽ� �Է¹޾Ƽ�
�迭�� ����� ���� ��� ����ϰ�
�迭�� ��� ���� �հ踦 ���*/
public class ch06ex02 {
	public static void main(String[] args) {
		int a[] = new int[10];
		int sum = 0;
		int i;/*
				 * a[0]=10; a[1]=20; a[2]=30; a[3]=40; a[4]=50; Scanner sc = new
				 * Scanner(System.in); while(sum>=150); { i=sc.nextInt();
				 * System.out.println(a[i]); sum=sum+a[i]; } System.out.println(sum);
				 */
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		for (i = 0; i < 10; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("==================================");
		System.out.println("�հ� = " + sum);

	}
}
