package a20_6_30;

import java.util.Scanner;
//1�� �Է��ϸ� �Ͽ��� 2�� �Է��ϸ� ������ - 7 ����
//�� ���� ���� �Է½� "error" ���
public class ch04ex02 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		switch (num) {  //�ݵ�� �������� �Ǵ� �������� ������
		case 1:            //case �ڿ� �ݵ�� ������
			System.out.println("�Ͽ���");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("ȭ����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�����");
			break;
		case 6:
			System.out.println("�ݿ���");
			break;
		case 7:
			System.out.println("�����");
			break;
		default:
			System.out.println("����");
			break;
		}
	}

}
