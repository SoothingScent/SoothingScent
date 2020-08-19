package a20_8_18;

public class Triangle implements Shape {
	int w, h;
	double res;

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

	@Override
	public void area() {
		res = w * h / 2;
	}

	@Override
	public void show() {
		System.out.println(res);

	}

	public Triangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	public Triangle() {
		super();
	}

}
