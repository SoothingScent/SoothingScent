package a20_7_13;

//�� ���� ���޹޾� �����ϴ� Swap() �޼��带 ����ÿ�.
public class aTest1 {

	public static void main(String[] args) {
		swap(10, 20);
	}

	public static void swap(int x, int y) {
		System.out.println(x + ", " + y);
		int z = x;
		x = y;
		y = z;
		System.out.println(x + ", " + y);
	}
}
