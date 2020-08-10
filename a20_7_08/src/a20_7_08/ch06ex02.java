package a20_7_08;

//배열에 저장된 값중 가장 큰 값을 max 에 저장한 후 max 를 출력하라
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
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}
}
