package a20_7_10;

import java.util.Scanner;

public class aTest3 {
	public static int abs(int x) {
		int res=0;
		if(x>=0) res=x;
		else if(x<0) res=x-x-x;
		return res;
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int ys = sc.nextInt();
	System.out.println(abs(ys));
}
}
