package a20_7_10;

import java.util.Scanner;

//두 수(a,b)를 sub()로 보내서 a부터 b까지의 합계
public class aTest1 {
	public static int add(int a, int b) {
		int i;
		int sum=0;
		for (i=a; i<=b; i++) {
			sum=sum+i;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println(add(a, b));
}
}
