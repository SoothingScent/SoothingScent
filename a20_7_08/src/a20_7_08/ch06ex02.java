package a20_7_08;

//�迭�� ����� ���� ���� ū ���� max �� ������ �� max �� ����϶�
public class ch06ex02 {
	public static void main(String[] args) {
		int a[] = { 90, 88, 77, 67, 89, 54, 99, 30 };
		int len = a.length;
		int b[] = new int[len];
		int i, max = 0, min = 9999;

		for (i = 0; i < len; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
	}
}
