package a20_7_09;

import java.util.Scanner;

//������ �Է��Ͽ� ������ �����̸� "����", ����̸� "���", 0�̸� 0���
public class ch06ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(sign(a));//sign <--res
	}

	public static String sign(int x) {
		String res = "0";
		if (x > 0)
			res = "���";
		else if (x < 0)
			res = "����";
		return res;
	}
}
