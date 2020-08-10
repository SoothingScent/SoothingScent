package a20_7_08;

public class ch06ex05 {
	public static void main(String[] args) {
		int a[][] = { { 90, 88, 77 }, { 67, 89, 54 }, { 99, 30, 30 }, { 0, 0, 0} };
		int i, j;
		/*
		 * int kor = 0, mat = 0, eng = 0;
		 */ System.out.println("번호\t\t국어\t\t수학\t\t영어\t\t합계");
		for (i = 0; i < 3; i++) {
			int sum = 0;
			System.out.print(i + 1 + "\t\t");
			for (j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t\t");
				sum = sum + a[i][j];
				a[3][j]=a[3][j]+a[i][j];
				/*
				 * if (j == 0) kor = kor + a[i][j]; if (j == 1) mat = mat + a[i][j]; if (j == 2) eng = eng + a[i][j];
				 */
			}
			System.out.println(sum);
			/*
			 * kor=kor+a[i][0]; mat=mat+a[i][1]; eng=eng+a[i][2];
			 */ }
//		System.out.print("합계\t\t" + kor + "\t\t" + mat + "\t\t" + eng);
		System.out.print("합계\t\t" + a[3][0] + "\t\t" + a[3][1] + "\t\t" + a[3][2]);
	}
}
