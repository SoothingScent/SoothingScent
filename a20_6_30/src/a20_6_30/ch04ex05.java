package a20_6_30;

import java.util.Scanner;

//1��3�� �Է��ϸ� "���ѹα� ����"
//2��4�� �Է��ϸ� "���ѹα� ����" ����Ͻÿ�
public class ch04ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
		case 3:
			System.out.println("���ѹα� ����");
			break;
		case 2:
		case 4:
			System.out.println("���ѹα� ����");
			break;
		default:
			System.out.println("1���� 4 �߿� �Է�");
		}
	}

}
