package a20_8_05;

public class Rectangle extends Shape {
	private int w, h;

	@Override
	public double area() {
		res = w * h;
		return res;
	}

	@Override
	public void show() {
		System.out.println("사각형의 넓이 : " + res);
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}

}
