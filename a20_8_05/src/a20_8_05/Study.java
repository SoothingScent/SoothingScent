package a20_8_05;

public class Study {
	public static void poly(Shape n) {
		if (n instanceof Circle) {
			Circle ci = (Circle) n;
			ci.setR(10);
			ci.area();
			ci.show();
		} else if (n instanceof Rectangle) {
			Rectangle re = (Rectangle) n;
			re.setH(10);
			re.setW(10);
			re.area();
			re.show();
		} else if (n instanceof Triangle) {
			Triangle tr = (Triangle) n;
			tr.setH(10);
			tr.setW(10);
			tr.area();
			tr.show();
		}

	}

}
