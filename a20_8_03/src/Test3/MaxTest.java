package Test3;

import org.omg.CORBA.portable.ValueOutputStream;

public class MaxTest {
	public static int max(int x, int y) {
		int ma;
		if (x > y)
			ma = x;
		else
			ma = y;
		return ma;
	}

	public static void main(String[] args) {
		String num1 = args[0];// 문자열
		String num2 = args[1];// 문자열
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();

		Integer n1 = Integer.valueOf(num1);
		Integer n2 = Integer.valueOf(num2);

		int res = max(n1, n2);
		System.out.println("최대값 : " + res);
	}
}
