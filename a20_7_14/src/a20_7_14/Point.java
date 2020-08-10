package a20_7_14;

public class Point {
	private int x, y;// 멤버변수 (팥/반죽 같은 재료는 공개하면 안됨)

	public void show() {// 멤버메소드 (레시피는 공개)
		System.out.println("x는 " + x);
		System.out.println("y는 " + y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//멤버 변수에 값 저장.

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
