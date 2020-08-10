package a20_7_29;

//main 파라메타에 10 +-*/ 5(Run Configuration - Argument)
//더하고 빼고 곱하기 나누기
public class WrapperTest3 {

	public static void main(String[] args/* 파라메타 */) {
		String num1 = args[0];
		String num2 = args[2];
		String op = args[1];
		int n1, n2;
		n1 = Integer.valueOf(num1);
		n2 = Integer.valueOf(num2);
		for (int i = 0; i < 4; i++) {
			char ch = op.charAt(i);
			int c = 0;
			switch (ch) {
			case '+':
				c = n1 + n2;
				break;
			case '-':
				c = n1 - n2;
				break;
			case '*':
				c = n1 * n2;
				break;
			case '/':
				c = n1 / n2;
				break;
			default:
				break;
			}
			System.out.println(c);
		}
		/*
		 * System.out.println(n1 + n2); System.out.println(n1 - n2);
		 * System.out.println(n1 * n2); System.out.println(n1 / n2);
		 */
	}
}
