package a20_7_29;

//문자열 123을 정수 123으로 변경
public class WrapperTest2 {
	public static void main(String[] args) {
		String str = "123";
		Integer num = Integer.valueOf(str);
		int ia = num.intValue();
		System.out.println(ia + 2);
		System.out.println(str + 2);

		String kor = "90";
		int ikor = Integer.valueOf(kor); // Auto-unboxing 바로 int 형으로
	}
}
