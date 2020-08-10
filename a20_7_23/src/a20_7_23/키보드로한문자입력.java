package a20_7_23;

import java.io.IOException;

public class 키보드로한문자입력 {
	public static void main(String[] args) throws IOException {
		int ch;
		ch = System.in.read();
		System.out.println((char) ch);
		// 자바는 입출력에 관련되는 외부적인 접근에 있어서
		// 에러가 생길 수 있는 것을 대비하여
		// 에러로 처리할 수 있도록 하고있다 => 예외처리(Exception)
	}
}
