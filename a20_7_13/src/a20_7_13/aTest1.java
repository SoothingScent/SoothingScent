package a20_7_13;

//두 수를 전달받아 스왑하는 Swap() 메서드를 만드시오.
public class aTest1 {

	public static void main(String[] args) {
		swap(10, 20);
	}

	public static void swap(int x, int y) {
		System.out.println(x + ", " + y);
		int z = x;
		x = y;
		y = z;
		System.out.println(x + ", " + y);
	}
}
