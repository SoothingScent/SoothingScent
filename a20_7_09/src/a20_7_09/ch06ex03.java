package a20_7_09;

public class ch06ex03 {
	public static void main(String[] args) {
		System.out.println(sum(100));
	}

	public static int sum(int i) {
		int hap = 0;
		while (i >= 1) {
			hap = hap + i;
			i--;
		}
		return hap;
	}

}
