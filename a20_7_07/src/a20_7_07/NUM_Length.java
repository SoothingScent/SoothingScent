package a20_7_07;

//num�迭�� ��� ���� ����ϰ�
//num�迭�� ��� ���� �D
//���(AVG) ���Ͻÿ�
public class NUM_Length {
	public static void main(String[] args) {
		double sum = 0, num[] = { 90.5, 88.5, 60, 75.0, 80.5 };
		int i;
		for (i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum = sum + num[i];
		}
		System.out.println("*�հ� : " + sum);
		System.out.println("**��� : " + sum / num.length);
	}
}
