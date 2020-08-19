package a20_8_13;

public class Call {
	public Call() {
	}

	public Call(Shape temp) {
		if (temp instanceof Circle) {
			Circle C = (Circle) temp;
			C.setR(5);
			C.area();
			C.show();
		} else if (temp instanceof Rectangle) {
			Rectangle R = (Rectangle) temp;
			R.setW(5);
			R.setH(6);
			R.area();
			R.show();
		} else if (temp instanceof Triangle) {
			Triangle T = (Triangle) temp;
			T.setW(5);
			T.setH(6);
			T.area();
			T.show();
		}
	}
}
