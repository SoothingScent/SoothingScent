package a20_8_18;

public class Rectangle implements Shape {
	int w, h;
	double res;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
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
	@Override
	public void area() {
		// TODO Auto-generated method stub
		res=w*h;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(res);
	}
	
}
