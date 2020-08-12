package REF형변환;

import javax.swing.JFrame;

public class 참조REFmain {
	public static void call(Point j) {
		if (j instanceof Point3D) {
			Point3D p = (Point3D) j;
			p.setX(10);
			p.setY(20);
			p.setZ(30);
			p.show();
		} else {
			j.setX(100);
			j.setY(200);
			j.show();
		}
	}

	public static void main(String[] args) {
		Point p = new Point3D();
		call(p);
		Point x = new Point();
		call(x);

		JFrame frame = new JFrame("연습프레임");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 300, 300, 300);
	}
}
