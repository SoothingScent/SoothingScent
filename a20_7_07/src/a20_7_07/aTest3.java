package a20_7_07;

//배열에 저장된 데이터중 짝수만 골라서 b 배열에 저장하시오
public class aTest3 {
	public static void main(String[] args) {
		int a[] = { 10, 90, 86, 77, 90, 23 };
		int len = a.length;
		int b[] = new int[len];
		int i, x = 0;
		for (i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				b[x] = a[i];
				x++;
			}
		}
		for (i = 0; i < x; i++) {
			System.out.println(b[i]);
		}
	}
}
