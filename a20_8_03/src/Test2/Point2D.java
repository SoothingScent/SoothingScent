package Test2;

public class Point2D {
	protected int x;
	protected int y;

	public Point2D() {
		System.out.println("2D»ý¼ºÀÚ");
	}

	public void show() {
		System.out.println(x);
		System.out.println(y);
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
