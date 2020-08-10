package a20_7_08;

//전체 배열의 합계와 평균을 구하시오.
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
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double) sum / len);
	}
}