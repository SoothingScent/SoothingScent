package a20_7_29;

//�⺻��������(����) -> ����Ŭ���� -> ���ڿ��� ����
public class WrapperTest {
	public static void main(String[] args) {
		int myint = 567;
		// ����, ����Ŭ������ �����Ͻÿ�.
		Integer wi = new Integer(myint); // ù��° ���
		Integer wi2 = Integer.valueOf(myint); // �ι�° ���

		String si = wi.toString();
		System.out.println(myint + 10 + 10 + 10);
		System.out.println(si + 10 + 10 + 10);

	}
}
