package a20_7_17;

class �ý� {
	private String color;
	private String meter;
	private String model;
	private int price;

	public void show() {
		System.out.println("���� : " + color);
		System.out.println("���� : " + meter);
		System.out.println("�� : " + model);
		System.out.println("�ݾ� : " + price);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMeter(String meter) {
		this.meter = meter;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public �ý�() {
		this.color = null;
		this.model = null;
		this.meter = null;
		this.price = 0;
	}

	public �ý�(String color, String model, String meter, int price) {
		this.color = color;
		this.model = model;
		this.meter = meter;
		this.price = price;
	}
}

public class aTest1 {
	public static void main(String[] args) {
		�ý� driverA = new �ý�();
		driverA.setColor("ȸ��");
		driverA.setModel("�ҳ�Ÿ");
		driverA.setMeter("8�� km");
		driverA.setPrice(3500);
		driverA.show();

		System.out.println();
		System.out.println("=========");
		System.out.println();

		�ý� driverB = new �ý�("���", "�׷���", "11�� km", 3500);
		driverB.show();

	}
}
