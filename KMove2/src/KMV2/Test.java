package KMV2;

public class Test {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		정렬 test = new 정렬();
		test.BubbleSort(a);
		test.prn(a);
		System.out.println();
		System.out.println();
		test.SelectSort_R(a);
		test.prn(a);
		System.out.println();
		System.out.println();
		test.SelectSort(a);
		test.prn(a);
		System.out.println();
		System.out.println();
		test.BubbleSort_R(a);
		test.prn(a);
		System.out.println();
		System.out.println();
		boolean t = test.BinarySearch(a, 30);
		if (t == true)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
