package a20_7_02;

public class OddSquare1to100withSW {
	public static void main(String[] args) {
		int N=0, H=0, SW=0;
		do {
			N++;
			if(SW==0) {H=H+N*N;
			SW=1;
			}
			else SW=0;
		}while(N<100);
	System.out.println(H);
	System.out.println(N);
	}
}
