package a20_7_10;

import java.util.Scanner;

//�� ��(a,b)�� sub()�� ������ a���� b������ �հ�
public class aTest1 {
	public static int add(int a, int b) {
		int i;
		int sum=0;
		for (i=a; i<=b; i++) {
			sum=sum+i;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println(add(a, b));
}
}
