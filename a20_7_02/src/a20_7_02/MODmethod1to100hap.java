package a20_7_02;

public class MODmethod1to100hap {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0 ;
		do {
			i++;
			if(i%2==1) sum = sum+i;
			
		}while(i<100);
		System.out.println(sum);
	}
}
