package a20_7_07;

//num배열의 모든 값을 출력하고
//num배열의 모든 값의 핪
//평균(AVG) 구하시오
public class NUM_Length {
	public static void main(String[] args) {
		double sum = 0, num[] = { 90.5, 88.5, 60, 75.0, 80.5 };
		int i;
		for (i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum = sum + num[i];
		}
		System.out.println("*합계 : " + sum);
		System.out.println("**평균 : " + sum / num.length);
	}
}
