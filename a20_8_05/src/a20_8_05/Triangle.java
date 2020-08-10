package a20_8_05;

public class Triangle extends Shape {
	private int w, h;

	@Override
	public double area() {
		res = w * h / 2;
		return res;
	}

	@Override
	public void show() {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + res);
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}

}
