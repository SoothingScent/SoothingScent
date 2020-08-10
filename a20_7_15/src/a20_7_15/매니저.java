package a20_7_15;

public class 매니저 {
	private String name;
	private int salary;
	private String department;

	public void show() {
		System.out.println("매니저명 : " + name);
		System.out.println("연봉 : " + salary);
		System.out.println("부서명 : " + department);
	}

	public void show(String man) {
		System.out.println(man + "명 = " + name);
		System.out.println(man + "연봉 = " + salary);
		System.out.println(man + "부서 = " + department);
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setSalary(int salary) {
		this.salary = salary;

	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public 매니저() {
		name = null;
		salary = 0;
		department = null;
	}
}
