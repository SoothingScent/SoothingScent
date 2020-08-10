package a20_7_15;

public class 고용 {
	private String name;
	private int salary;

	public void show() {
		System.out.println("이름 : " + name + ", 연봉 : " + salary);
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setSalary(int salary) {
		this.salary = salary;

	}

	public 고용() {
		name = null;
		salary = 0;
	}
}
