package a20_7_17;

class 택시 {
	private String color;
	private String meter;
	private String model;
	private int price;

	public void show() {
		System.out.println("색상 : " + color);
		System.out.println("미터 : " + meter);
		System.out.println("모델 : " + model);
		System.out.println("금액 : " + price);
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

	public 택시() {
		this.color = null;
		this.model = null;
		this.meter = null;
		this.price = 0;
	}

	public 택시(String color, String model, String meter, int price) {
		this.color = color;
		this.model = model;
		this.meter = meter;
		this.price = price;
	}
}

public class aTest1 {
	public static void main(String[] args) {
		택시 driverA = new 택시();
		driverA.setColor("회색");
		driverA.setModel("소나타");
		driverA.setMeter("8만 km");
		driverA.setPrice(3500);
		driverA.show();

		System.out.println();
		System.out.println("=========");
		System.out.println();

		택시 driverB = new 택시("흰색", "그랜저", "11만 km", 3500);
		driverB.show();

	}
}
