package a20_6_29;
public class ch03ex02 {
	public static void main(String[] args) {
		int a=10, b=3; //4bytes
		double c; //8bytes (float : 32bit(4bytes))
		char x; //2bytes
		String name; // �Է��� ��ŭ
		boolean T; // 1byte(True / False)
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a/(double)b);//������� �Ǽ������� ����
		System.out.println(a%b);//������
		System.out.println(a&b);//��Ʈ������ and
		System.out.println(a|b);//��Ʈ������ or
		System.out.println(a+=b); // a=a+b �� ���
		a++; // a=a+1 a++ ++a 1�� ����
		b--; // b=b-1 b-- --b 1�� ����
		System.out.println(a+", "+b);

		int z;
		z=a;
		a=b;
		b=z;
		System.out.println(a+", "+b);
	}
}
