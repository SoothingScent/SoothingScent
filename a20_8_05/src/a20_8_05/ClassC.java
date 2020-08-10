package a20_8_05;

class ClassA {

}

class ClassB extends ClassA {

}

public class ClassC {
	public static ClassC getC() {
		return new ClassC();
	}

	public static void main(String[] args) {
		ClassA A = new ClassA();
		ClassB B = new ClassB();
		ClassC C = new ClassC(); // 자신의 클래스를 객체화
		ClassC c = getC();
	}
}
