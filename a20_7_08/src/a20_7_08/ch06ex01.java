package a20_7_08;

public class ch06ex01 {
	public static void main(String[] args) {
		String a[] = new String[4];
		a[0] = "대한민국";
		a[1] = "일본";
		a[2] = "미국";
		a[3] = "일본";
		int len = a.length;
		String b[] = new String[len];
		int i = 0, x = 0;
		for (i = 0; i < len; i++) {
			if (a[i] != "일본") {
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
