package a20_6_29;

import java.util.Scanner;

public class ch03ex04 {
	public static void main(String[] args) {
		int a, b, c, max;
		//System.out.println((a>b)?"��":"�ƴϿ�");
		//���׿����� ((����1)?true�� ���2:false�� ���3)
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		max=(a>b)?a:b;
		max=(max>c)?max:c;
		System.out.println("�ִ밪="+max);
			
	}
}
