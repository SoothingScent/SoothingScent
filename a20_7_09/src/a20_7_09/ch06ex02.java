package a20_7_09;

import java.util.Scanner;

//정수를 입력하여 정수가 음수이면 "음수", 양수이면 "양수", 0이면 0출력
public class ch06ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(sign(a));//sign <--res
	}

	public static String sign(int x) {
		String res = "0";
		if (x > 0)
			res = "양수";
		else if (x < 0)
			res = "음수";
		return res;
	}
}
