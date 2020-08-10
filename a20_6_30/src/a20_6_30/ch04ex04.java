package a20_6_30;

public class ch04ex04 {
	public static void main(String[] args) {
		int a=10, b=5, c=0;
		switch ('/') {
		case '+': c=a+b; break;
		case '-': c=a-b; break;
		case '*': c=a*b; break;
		case '/': c=a/b; break;
		default:System.out.println("잘못된 기호");
		}
System.out.println(c);
	}

}
