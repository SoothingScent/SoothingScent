package a20_7_02;
//1���� 100(a)���� ��(hap)
public class dowhile�� {
public static void main(String[] args) {
	int a = 1; int hap =0;
	do {
		System.out.println(a);
		hap=hap+a;
		a++;
	}while(a<=100);
	System.out.println(hap);
}
}
