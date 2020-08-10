package a20_7_06;

//1-100까지(a++) 중 짝수(a%2==0)의 합계(hap)
public class aTest1 {
	public static void main(String[] args) {
		int a;
		int hap = 0;
		for (a = 1; a <= 100; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
				hap = hap + a;
			}
		}
		System.out.println(hap);
	}
}
