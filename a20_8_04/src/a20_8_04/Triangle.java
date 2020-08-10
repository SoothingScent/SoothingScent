package a20_8_04;

public class Triangle {
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

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}

	public void cal() {
		res = (w * h) / 2;
	}

	public Triangle() {

	}

	public static Triangle getTriangle() {
		return new Triangle();
	}
}
