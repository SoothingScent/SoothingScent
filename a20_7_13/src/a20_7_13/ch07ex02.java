package a20_7_13;

import java.util.Scanner;

public class ch07ex02 {
	public static void main(String[] args) {
		성적 kim;
		kim = new 성적();
		Scanner sc = new Scanner(System.in);

		kim.국어 = sc.nextInt();
		kim.수학 = sc.nextInt();
		kim.영어 = sc.nextInt();
		kim.총점구하기();
		kim.평균구하기();
		kim.학점구하기();
		kim.출력();
		sc.close();
	}
}
