package a20_7_08;

public class ch06ex01 {
	public static void main(String[] args) {
		String a[] = new String[4];
		a[0] = "���ѹα�";
		a[1] = "�Ϻ�";
		a[2] = "�̱�";
		a[3] = "�Ϻ�";
		int len = a.length;
		String b[] = new String[len];
		int i = 0, x = 0;
		for (i = 0; i < len; i++) {
			if (a[i] != "�Ϻ�") {
				b[x] = a[i];
				x++;
			}
			System.out.println(a[i]);
		}
		System.out.println("==========");
		for (i = 0; i < x; i++) {
			System.out.println(b[i]);
		}
	}
}
