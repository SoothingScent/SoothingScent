package a20_6_30;

import java.util.Scanner;

//������ ���� �Է¹޾Ƽ� �� ���� 3�� ����̸� "3�� ���" ��� else �������� �Ѵ�.
public class atest01 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		/*int X = num - num / 3 * 3;
		 if(X==0) System.out.println("3�� ���")
		 ������ ��� ����*/
		if(num%3==0) System.out.println("3�� ���");
		System.out.println("��");
		
		//������ ���ϴ� ���� ( x=a%b = a-a/b*b = a-int(a/b)*b )
	}
	
}
