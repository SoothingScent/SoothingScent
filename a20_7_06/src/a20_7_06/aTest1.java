package a20_7_06;

//1-100����(a++) �� ¦��(a%2==0)�� �հ�(hap)
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
