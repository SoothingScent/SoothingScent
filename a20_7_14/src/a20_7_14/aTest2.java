package a20_7_14;

public class aTest2 {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		p.show();

		p.set(100, 200);
		p.show();

		System.out.println(p.getX()+p.getY());
	}

}
