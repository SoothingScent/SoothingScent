package a20_7_06;

public class algo9 {
	public static void main(String[] args) {
/*		*/
		int a = 1/*�� ��*/,  b = 1/*�� ��*/, y =a+b/*�հ�*/;
		int n = 2;//���� ����
		do {
			int c/*���װ� ������ ��*/=a+b;
			y=y+c;
			
			a=b;
			b=c;
			n++;
		}while(n<10);
		System.out.println(y);
	}
}
