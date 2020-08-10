package a20_7_06;

import java.util.Scanner;

/*a배열에 스캐너를 이용하여 입력받아서
배열에 저장된 값을 모두 출력하고
배열의 모든 값의 합계를 출력*/
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
		System.out.println("합계 = " + sum);

	}
}
