package a20_8_05;

class Point2D {
	public int x, y;

	void show() {
		System.out.println("2d��");
	}
}

class Point3D extends Point2D {
	public int z;

	void show() {
		System.out.println("3d��");
	}
}

public class CastTest {
	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.show();
		Point2D up = pt;
		System.out.println(up.x);
		System.out.println(up.y);
		up.show();
	}
}
