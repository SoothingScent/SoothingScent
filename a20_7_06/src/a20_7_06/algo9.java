package a20_7_06;

public class algo9 {
	public static void main(String[] args) {
/*		*/
		int a = 1/*앞 항*/,  b = 1/*뒷 항*/, y =a+b/*합계*/;
		int n = 2;//항의 갯수
		do {
			int c/*앞항과 뒷항의 합*/=a+b;
			y=y+c;
			
			a=b;
			b=c;
			n++;
		}while(n<10);
		System.out.println(y);
	}
}
