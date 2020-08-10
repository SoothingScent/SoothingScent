package a20_6_29;
public class ch03ex02 {
	public static void main(String[] args) {
		int a=10, b=3; //4bytes
		double c; //8bytes (float : 32bit(4bytes))
		char x; //2bytes
		String name; // 입력한 만큼
		boolean T; // 1byte(True / False)
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a/(double)b);//결과값을 실수형으로 산출
		System.out.println(a%b);//나머지
		System.out.println(a&b);//비트연산자 and
		System.out.println(a|b);//비트연산자 or
		System.out.println(a+=b); // a=a+b 의 축약
		a++; // a=a+1 a++ ++a 1씩 증가
		b--; // b=b-1 b-- --b 1씩 감소
		System.out.println(a+", "+b);

		int z;
		z=a;
		a=b;
		b=z;
		System.out.println(a+", "+b);
	}
}
