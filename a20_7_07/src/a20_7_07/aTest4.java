package a20_7_07;

public class aTest4 {
	// ���̳ʽ����� ã�� minus[] �迭�� �ְ�
	// minus[]�迭�� �հ�� ����� ���϶�.
	public static void main(String[] args) {
		int jumsu[] = { 100, 90, 80, 78, 56, -34, -90 };
		int len = jumsu.length;
		int minus[] = new int[len];
		int i, cn = 0, hap = 0;
		for (i = 0; i < len; i++) {
			if (jumsu[i] < 0) {
				minus[cn] = jumsu[i];
				hap = hap + minus[cn];
				cn++;
			}
		}
		for (i = 0; i < cn; i++) {
			System.out.println("minus[" + i + "] : " + minus[i]);
		}
		System.out.println("===========");
		System.out.println("���� : " + cn);
		System.out.println("�հ� : " + hap);
		System.out.println("��� : " + (double) hap / cn);
	}
}
