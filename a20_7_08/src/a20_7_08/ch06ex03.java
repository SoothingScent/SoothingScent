package a20_7_08;

//��ü �迭�� �հ�� ����� ���Ͻÿ�.
public class ch06ex03 {
	public static void main(String[] args) {
		int a[] = { 90, 88, 77, 67, 89, 54, 99, 30 };
		int len = a.length;
		int i, sum = 0;
		for (i = 0; i < len; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
			sum = sum + a[i];
		}
		System.out.println("=========");
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double) sum / len);
	}
}