package a20_7_21;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3;
		str3 = str1 + str2;
		System.out.println(str3);
		System.out.println(str3.length());
		System.out.println(str3.replace('H', 'h'));
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str3);
		System.out.println(str3.charAt(0));// ù�ڸ� = 0��°�ڸ��� ���
		System.out.println(str3.charAt(2));
		str3 = str3.concat("		");
		System.out.println(str3.length());
		str3 = str3.trim();
		System.out.println(str3.length());
		System.out.println(str3.substring(2, 5));// ����
		String jumin = "991225-1678976";
		System.out.println(jumin.substring(7, 8));
		System.out.println(jumin.charAt(7));// �ش���ġ �ѱ��ڸ�

		switch (jumin.charAt(7)) {
		case '1':
			System.out.println("����");
			break;
		case '3':
			System.out.println("����");
			break;
		case '2':
			System.out.println("����");
			break;
		case '4':
			System.out.println("����");
			break;
		default:
			System.out.println("����");
		}

	}
}
