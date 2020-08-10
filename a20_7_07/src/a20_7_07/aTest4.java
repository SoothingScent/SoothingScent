package a20_7_07;

public class aTest4 {
	// 마이너스값을 찾아 minus[] 배열에 넣고
	// minus[]배열의 합계와 평균을 구하라.
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
		System.out.println("갯수 : " + cn);
		System.out.println("합계 : " + hap);
		System.out.println("평균 : " + (double) hap / cn);
	}
}
