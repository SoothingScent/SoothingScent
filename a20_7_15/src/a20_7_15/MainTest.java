package a20_7_15;

public class MainTest {
	public static void main(String[] args) {
		고용 kim = new 고용();
		kim.setName("홍길동");
		kim.setSalary(3000);
		kim.show();

		System.out.println("=============");

		매니저 m = new 매니저();
		m.setName("이민호");
		m.setSalary(5000);
		m.setDepartment("홍보부");
		m.show();
		m.show("연예인");

		System.out.println("=============");
		생성자 dog = new 생성자();
		dog.show();
		
	}
}
//overloading : 이름이 동일한 메소드를 2개 이상 가질 수 있음
//ex) void show(){}, void show(String man){}