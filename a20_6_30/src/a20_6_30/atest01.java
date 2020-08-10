package a20_6_30;

import java.util.Scanner;

//임의의 수를 입력받아서 그 수가 3의 배수이면 "3의 배수" 출력 else 끝나도록 한다.
public class atest01 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		/*int X = num - num / 3 * 3;
		 if(X==0) System.out.println("3의 배수")
		 동일한 결과 산출*/
		if(num%3==0) System.out.println("3의 배수");
		System.out.println("끝");
		
		//나머지 구하는 공식 ( x=a%b = a-a/b*b = a-int(a/b)*b )
	}
	
}
