package a20_6_29;

import java.util.Scanner;

//���ڸ� �Է¹޾Ƽ� ����̸� "���", 0�̸� "0", �����̸� "����" �� ��µǵ��� �Ͻÿ�.
public class ch04ex03 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>0) System.out.println("���");
		else if(num==0) System.out.println("0");
		else if(num<0) System.out.println("����");
		System.out.println("��");
	}
}
