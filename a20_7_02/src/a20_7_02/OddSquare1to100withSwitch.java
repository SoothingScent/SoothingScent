package a20_7_02;

public class OddSquare1to100withSwitch {
	public static void main(String[] args) {
		int N=0, H=0, SW=0;
		do {
			N++;
			SW=N%2;
			switch (SW) {
			case 1:H=H+N*N;
			case 0:
			default:
			}
		}while(N<100);
		System.out.println(H);
	}
}
