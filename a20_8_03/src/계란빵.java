
public class 계란빵 extends 붕어빵 {

	private int 틀;
	private int 계란;

	public void show() {
		System.out.println(틀);
	}
	// 상속된 메소드와 자신의 메소드가 동일할 때
	// 자신의 메소드가 수행됨(재정의)(overriding)

	public void 계란빵만들기() {
		틀 = 반죽 + 계란 + 반죽;
	}

	public 계란빵() {
		System.out.println("계란빵");
	}

	public 계란빵(int 계란, int 반죽) {
		this.계란 = 계란;
		this.반죽 = 반죽;
	}
}
