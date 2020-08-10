package a20_7_23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 키보드테스트2 {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		// 문자로 변경
		BufferedReader in = new BufferedReader(isr);// 버퍼로 변경
		System.out.println("글씨를 입력하면 따라합니다.");
		String str = in.readLine();
		System.out.println(str);

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(name);
	}

}
