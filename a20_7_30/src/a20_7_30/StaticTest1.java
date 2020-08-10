package a20_7_30;

class point3 {
	static int x;
	int y;

	public void cal() {
		x = x + 10;
		y = y + 10;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

	public static void test() {
	}
}

public class StaticTest1 {
	public static void main(String[] args) {
		point3 park = new point3();
		park.cal();
		point3 kim = new point3();
		kim.cal();
		point3 lee = new point3();
		lee.cal();

		System.out.println(point3.x);
		// 클래스 명을 통해 바로 접근 가능

	}
}
