package a20_7_01;

import java.util.Scanner;

//������ 5ȸ �Է¹޾Ƽ� ����� ���϶�
public class inputJUMSU5timesANDavg {
	public static void main(String[] args)
	{
		int sum=0, cnt=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5;i++)
	{		System.out.println("������ �Է��Ͻÿ�");
			int jumsu = sc.nextInt();
			sum = sum + jumsu;		
			cnt++;
	}
				System.out.println("���� : " + sum + "��");
				System.out.println("��� : " + (double)sum/cnt + "��");
	}
}