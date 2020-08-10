package a20_7_29;

//기본데이터형(정수) -> 랩퍼클래스 -> 문자열로 변경
public class WrapperTest {
	public static void main(String[] args) {
		int myint = 567;
		// 정수, 랩퍼클래스로 변경하시오.
		Integer wi = new Integer(myint); // 첫번째 방법
		Integer wi2 = Integer.valueOf(myint); // 두번째 방법

		String si = wi.toString();
		System.out.println(myint + 10 + 10 + 10);
		System.out.println(si + 10 + 10 + 10);

	}
}
