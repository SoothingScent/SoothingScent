package a20_7_14;

public class Point {
	private int x, y;// ������� (��/���� ���� ���� �����ϸ� �ȵ�)

	public void show() {// ����޼ҵ� (�����Ǵ� ����)
		System.out.println("x�� " + x);
		System.out.println("y�� " + y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//��� ������ �� ����.

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
