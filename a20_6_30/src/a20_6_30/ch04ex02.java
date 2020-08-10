package a20_6_30;

import java.util.Scanner;
//1을 입력하면 일요일 2를 입력하면 월요일 - 7 까지
//그 외의 숫자 입력시 "error" 출력
public class ch04ex02 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		switch (num) {  //반드시 정수변수 또는 정수식이 들어가야함
		case 1:            //case 뒤에 반드시 정수값
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		default:
			System.out.println("에러");
			break;
		}
	}

}
