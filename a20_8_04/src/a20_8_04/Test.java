package a20_8_04;

class A {

	public A() {
	}
	public A(Object obj) {
		if(obj instanceof Test) {
			Test jeong = (Test) obj;
			System.out.println(jeong);
		}
	}

}

class B {
	public B() {
	}

	public B(Object obj) {
		if (obj instanceof Test) {
			Test lee = (Test) obj;
			System.out.println(lee);
		}
	}
}

public class Test {
	public static Test getxx() {
		return new Test();
	}

	public static void main(String[] args) {
		B kim = new B(getxx());
		A jeong = new A(getxx());
	}
}
