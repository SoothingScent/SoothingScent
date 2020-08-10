package a20_7_03;

public class Stressplusplus {
public static void main(String[] args) {
	int N=0, H=0, SW=0;
	do {
		N++;
		if(SW==0) {H=H+N; SW=1;}
		else {H=H-N; SW=0;}
	}while(N<100);
	System.out.println(H);
}
}
