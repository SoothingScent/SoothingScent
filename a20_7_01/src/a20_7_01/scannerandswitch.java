package a20_7_01;

import java.util.Scanner;

public class scannerandswitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:System.out.println("1월");break;
		case 2:System.out.println("2월");break;
		case 3:System.out.println("3월");break;
		case 4:System.out.println("4월");break;
		case 5:System.out.println("5월");break;
		case 6:System.out.println("6월");break;
		case 7:System.out.println("7월");break;
		case 8:System.out.println("8월");break;
		case 9:System.out.println("9월");break;
		case 10:System.out.println("10월");break;
		case 11:System.out.println("11월");break;
		case 12:System.out.println("12월");break;
		
		default:System.out.println("에러");
			break;
		}
	}

}
