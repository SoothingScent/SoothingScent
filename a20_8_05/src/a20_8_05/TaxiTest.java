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
		System.out.println("모델명 : " + Model);
		System.out.println("색상 : " + Color);
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
		System.out.println("택시 미터기 : " + TaxiMeter);
		System.out.println("기본요금 : " + TaxiFare);
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

		Car c2 = new Car("아반떼", "흰색");
		c2.show();
		System.out.println();
		Car c4 = new Taxi("소나타", "회색", true, 3300);
		c4.show();
		System.out.println();

	}
}
