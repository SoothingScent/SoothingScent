package a20_7_03;

public class CONTINUE {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++) {
			if(i%3==0) break;
			System.out.println(i);
		}
		System.out.println();
		for(i=1;i<=10;i++) {
			if(i%3==0) continue;
			System.out.println(i);
		}
	}
}
