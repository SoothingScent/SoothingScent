package a20_6_30;

import java.util.Scanner;

/*�̸�(name),����(kor),����(mat),����(eng)
�Է¹޾Ƽ� ����(tot)�� ���(avg)�� ���Ͻÿ�
�̸��� ������ ����� ���Ͻÿ�*/

//����� 60�� �̻��̰� ��� ������ 40�� �̻��̸� "�հ�", �ƴ� ��� "���հ�" ���
//����� 60�� �̸��̰ų� �� �����̶� 40�� �̸��̸� "���հ�" �ƴ� ��� "�հ�" ���
public class ch04ex01 {
	public static void main(String[] args) {
		String name;
		int kor,mat,eng,tot;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�");
		name=sc.next();
		System.out.println("���� ������ �Է��Ͻÿ�");
		kor=sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		mat=sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		eng=sc.nextInt();
		tot = kor+mat+eng;
		avg = tot/3.0;
		System.out.println("�̸� : " + name + "\n" + "���� : " + kor + "\t" + "���� : " + mat + "\t" + "���� : " + eng + "\n" + "���� : " + tot + "\n" + "��� : "+ avg);
		if( avg>=60 && kor>=40 && mat>=40 && eng>=40 ) System.out.println("�հ�");
		else System.out.println("���հ�");
	}

}
