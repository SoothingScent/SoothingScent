package a20_7_17;

public class �ڵ��� {
	private String model;
	private String color;

	public void show() {
		System.out.println("�𵨸� : " + model);
		System.out.println("���� : " + color);
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

	public �ڵ���() {
		super();
	}

	public �ڵ���(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

}
