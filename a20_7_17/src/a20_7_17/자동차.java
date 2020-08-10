package a20_7_17;

public class 자동차 {
	private String model;
	private String color;

	public void show() {
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public 자동차() {
		super();
	}

	public 자동차(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

}
