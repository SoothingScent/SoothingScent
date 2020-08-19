package a20_8_18;

public class Circle implements Shape {

	int r;
	double res;

	public Circle(int r) {
		super();
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}

	public void area() {
		res = r * r * Math.PI;
	}

	public Circle() {

	}

	public void show() {
		System.out.println(res);
	}

	public static Circle getCircle() {
		return new Circle();
	}
}
