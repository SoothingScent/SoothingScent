package a20_8_04;

public class Circle {
	int r;
	double res;

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

	public void cal() {
		res = r * r * Math.PI;
	}

	public Circle() {

	}

	public static Circle getCircle() {
		return new Circle();
	}
}
