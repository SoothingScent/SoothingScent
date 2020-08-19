package a20_8_13;

public class Rectangle extends Shape {
	private int w, h;

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("사각형의 넓이 = " + res);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
	}

	@Override
	public void area() {
		res = w * h;
		// TODO Auto-generated method stub

	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

}
