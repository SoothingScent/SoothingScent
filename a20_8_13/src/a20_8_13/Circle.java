package a20_8_13;

public class Circle extends Shape {
	private int r;

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		res = r * r * Math.PI;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("¿ø³ÐÀÌ = " + res);
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

}
