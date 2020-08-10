package a20_7_03;

public class StressIppai {
public static void main(String[] args) {
	int N=0, H=0;
	do {
		N++;
		if(N%2==1) H = H +N;
		else H= H-N;		
	}while(N<100);
System.out.println(H);
}
}
