package a20_7_02;

public class While1to100�� {
	public static void main(String[] args) {
		int i, sum;
		i=0; sum=0;
		do {
			i=i+2;
			sum=sum+i;
		}while(i<100);
		System.out.println(sum);
	}
}
