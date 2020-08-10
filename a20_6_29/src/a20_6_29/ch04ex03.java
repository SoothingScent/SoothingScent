package a20_6_29;

import java.util.Scanner;

//숫자를 입력받아서 양수이면 "양수", 0이면 "0", 음수이면 "음수" 로 출력되도록 하시오.
public class ch04ex03 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>0) System.out.println("양수");
		else if(num==0) System.out.println("0");
		else if(num<0) System.out.println("음수");
		System.out.println("끝");
	}
}
