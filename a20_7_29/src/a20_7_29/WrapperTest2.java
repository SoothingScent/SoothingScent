package a20_7_29;

//���ڿ� 123�� ���� 123���� ����
public class WrapperTest2 {
	public static void main(String[] args) {
		String str = "123";
		Integer num = Integer.valueOf(str);
		int ia = num.intValue();
		System.out.println(ia + 2);
		System.out.println(str + 2);

		String kor = "90";
		int ikor = Integer.valueOf(kor); // Auto-unboxing �ٷ� int ������
	}
}
