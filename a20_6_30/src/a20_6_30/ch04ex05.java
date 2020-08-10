package a20_6_30;

import java.util.Scanner;

//1과3을 입력하면 "대한민국 남성"
//2와4를 입력하면 "대한민국 여성" 출력하시오
public class ch04ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
		case 3:
			System.out.println("대한민국 남성");
			break;
		case 2:
		case 4:
			System.out.println("대한민국 여성");
			break;
		default:
			System.out.println("1부터 4 중에 입력");
		}
	}

}
