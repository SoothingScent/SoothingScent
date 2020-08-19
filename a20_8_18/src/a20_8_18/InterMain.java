package a20_8_18;

public class InterMain {
	public static void call(Shape s, int x) {
		if (s instanceof Circle) {
			Circle c = (Circle) s;
			c.area();
			c.show();
		} else if (s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			r.area();
			r.show();
		} else if (s instanceof Triangle) {
			Triangle t = (Triangle) s;
			t.area();
			t.show();
		}
		switch (x) {
		case Shape.RED:
			System.out.println("»¡°­");
			break;
		case Shape.GREEN:
			System.out.println("³ì»ö");
			break;
		case Shape.BLUE:
			System.out.println("ÆÄ¶û");
			break;
		}
	}

	public static void main(String[] args) {
		Circle c = new Circle(5);
		call(c, Shape.RED);
		Rectangle r = new Rectangle(5, 6);
		call(r, Shape.BLUE);
		Triangle t = new Triangle(5, 6);
		call(t, Shape.GREEN);
	}

}
