package Test2;

public class Point3D extends Point2D {
	protected int z = 30;

	public Point3D() {
		super(0, 0);
		System.out.println("3D������");

	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void show() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
