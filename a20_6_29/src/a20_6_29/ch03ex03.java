package a20_6_29;

public class ch03ex03 {
	public static void main(String[] args) {
		int a = 12, b = 4;
		int c,d,e,f;
		c = a ^ b;
/*		a ���� b ���� ��Ʈ�� ��ȯ �� xor�� ���
		(�� ��Ʈ�� �ٸ��� 1 ������ 0)
		1100(12) xor 0100(4) �̹Ƿ� 1000 = 8 �� �����*/
		d = a << 3; //�������� 3 ��Ʈ �̵� 12 x 2�� 3��
		//00001100(12) -> 01100000(96)
		e = a >> 3; //���������� 3 ��Ʈ �̵� 12 / 2�� 3��
		//00001100(12) -> 00000001(1) (1�� ������)
		f = ~a+1; // 1�� ����+1 (2�Ǻ���)
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
	}

}
