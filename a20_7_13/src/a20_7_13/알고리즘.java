package a20_7_13;

public class 알고리즘 {
	public static void main(String[] args) {
		int LM = 0;
		int N;
		int J;
		for (N = 4; N <= 1000; N++) {
			int SUM = 0;
			int K = N / 2;
			for (J = 1; J <= K; J++) {
				int R = N % J;
				if (R == 0)
					SUM = SUM + J;
			}
			if (N == SUM) {
				System.out.println(N);
				LM++;
			}
		}
		System.out.println("갯수 : " + LM);
	}
}
