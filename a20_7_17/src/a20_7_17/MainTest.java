package a20_7_17;

public class MainTest {
	public static void main(String[] args) {
		자동차 kim = new 자동차();
		kim.setModel("BMW");
		kim.setColor("검정");
		kim.show();

		자동차 lee = new 자동차("그랜저", "블루");
		lee.show();
		lee.setColor("빨강");
		lee.show();
	}
}
