package a20_7_29;

public class WrapperTest4 {
	public static void main(String[] args) {
		String num = "11";

		int bin = Integer.parseInt(num, 2);
		int oct = Integer.parseInt(num, 8);
		int dec = Integer.parseInt(num, 10);
		int hex = Integer.parseInt(num, 16);

		System.out.println(num);
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(dec);
		System.out.println(hex);
	}
}
