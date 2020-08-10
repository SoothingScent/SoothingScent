package a20_6_30;

import java.util.Scanner;

/*이름(name),국어(kor),수학(mat),영어(eng)
입력받아서 총점(tot)과 평균(avg)를 구하시오
이름과 총점과 평균을 구하시오*/

//평균이 60점 이상이고 모든 과목이 40점 이상이면 "합격", 아닐 경우 "불합격" 출력
//평균이 60점 미만이거나 한 과목이라도 40점 미만이면 "불합격" 아닐 경우 "합격" 출력
public class ch04ex01 {
	public static void main(String[] args) {
		String name;
		int kor,mat,eng,tot;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		name=sc.next();
		System.out.println("국어 성적을 입력하시오");
		kor=sc.nextInt();
		System.out.println("수학 성적을 입력하시오");
		mat=sc.nextInt();
		System.out.println("영어 성적을 입력하시오");
		eng=sc.nextInt();
		tot = kor+mat+eng;
		avg = tot/3.0;
		System.out.println("이름 : " + name + "\n" + "국어 : " + kor + "\t" + "수학 : " + mat + "\t" + "영어 : " + eng + "\n" + "총점 : " + tot + "\n" + "평균 : "+ avg);
		if( avg>=60 && kor>=40 && mat>=40 && eng>=40 ) System.out.println("합격");
		else System.out.println("불합격");
	}

}
