package a20_8_05;

class Car {
	protected String Model, Color;

	public Car() {

	}

	public Car(String Model, String Color) {
		this.Model = Model;
		this.Color = Color;
	}

	public void show() {
		System.out.println("�𵨸� : " + Model);
		System.out.println("���� : " + Color);
	}
}

class Taxi extends Car {
	private Boolean TaxiMeter;
	private int TaxiFare = 3300;

	public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Taxi(Boolean TaxiMeter, int TaxiFare) {
		super();
		this.TaxiMeter = TaxiMeter;
		this.TaxiFare = TaxiFare;
	}

	public Taxi(String Model, String Color) {
		super(Model, Color);
		// TODO Auto-generated constructor stub
	}

	public Taxi(String Model, String Color, Boolean TaxiMeter, int TaxiFare) {
		super(Model, Color);
		this.TaxiMeter = TaxiMeter;
		this.TaxiFare = TaxiFare;
	}

	public void show() {
		super.show();
		System.out.println("�ý� ���ͱ� : " + TaxiMeter);
		System.out.println("�⺻��� : " + TaxiFare);
	}

}

public class TaxiTest {
	public static void main(String[] args) {
		Taxi t = new Taxi();
		t.show();
		System.out.println();
		Taxi t2 = new Taxi(true, 3300);
		t2.show();
		System.out.println();

		Car c2 = new Car("�ƹݶ�", "���");
		c2.show();
		System.out.println();
		Car c4 = new Taxi("�ҳ�Ÿ", "ȸ��", true, 3300);
		c4.show();
		System.out.println();

	}
}
