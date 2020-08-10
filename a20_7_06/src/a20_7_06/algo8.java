package a20_7_06;

public class algo8 {
	public static void main(String[] args) {
		double i = 0, h = 0;
		for (i = 0; i <= 49; i++) {
			h = h + i / (i + 1);
		}
		System.out.println(h);
	}
}
