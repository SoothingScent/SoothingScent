package a20_6_25;

public class ch02ex01 {
		public static void main(String[] args) {
			int kor, eng, mat, tot; //정수형
			double avg;                //실수형
			kor=100;
			eng=100;
			mat=90;
			tot=kor+eng+mat;
			avg=tot/3.0;                //정수(tot)를 정수(3)로 나누면 정수다.
			                                  //3 -> 3.0(실수)으로 나눌것.
			System.out.println(avg);
			
		}
}
