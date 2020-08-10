package a20_7_14;

public class Test {
public static void main(String[] args) {
	int i, hap=0, cnt=0;
	double avg;
	for (i=1; i<=100; i++) {
		if(i%3==0) {hap=hap+i; cnt++;}
	}
	avg=hap/cnt;
	System.out.println("ÇÕ°è = "+hap);
	System.out.println("°¹¼ö = "+cnt);
	System.out.println("Æò±Õ = "+avg);
	
	int a=10, b;
	if (a==10&&a>5) a++;
	b=++a;
	System.out.println(a+", "+b);
}
}
