package a20_7_03;

public class dutsem {
public static void main(String[] args) {
	int k=0, n=1, h=1;
	do {
		k++;
		n=n+k;
		h=h+n;		
	}while(k<9);
	System.out.println(h);
}
}
