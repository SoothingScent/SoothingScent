package a20_7_15;

//생성( a = new 할때) 시에 값을 초기화하기 위한 용도
public class 생성자/* Constructor 메소드 */ {
	/* 클래스명과 동일한 메소드명이고 return 값이 없음(즉 void가 없음) */

	private String dog_name;
	private int dog_age;

	public void show() {
		System.out.println("개 이름 = " + dog_name);
		System.out.println("개 나이 = " + dog_age);
	}

	public void setDog_name(String dog_name) {
		this.dog_name = dog_name;

	}

	public void setDog_age(int dog_age) {
		this.dog_age = dog_age;
	}

	public 생성자() {// default 생성자 메소드(클래스명과 동일)
		dog_name = "몽키";
		dog_age = 3;
	}

	public 생성자(String dog_name) {
		this.dog_name = dog_name;

	}

	public 생성자(String dog_name, int dog_age) {
		this.dog_name = dog_name;
		this.dog_age = dog_age;

	}
}//생성자 method도 overloading 가능
