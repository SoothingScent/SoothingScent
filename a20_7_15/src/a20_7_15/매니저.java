package a20_7_15;

public class �Ŵ��� {
	private String name;
	private int salary;
	private String department;

	public void show() {
		System.out.println("�Ŵ����� : " + name);
		System.out.println("���� : " + salary);
		System.out.println("�μ��� : " + department);
	}

	public void show(String man) {
		System.out.println(man + "�� = " + name);
		System.out.println(man + "���� = " + salary);
		System.out.println(man + "�μ� = " + department);
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

	public �Ŵ���() {
		name = null;
		salary = 0;
		department = null;
	}
}
