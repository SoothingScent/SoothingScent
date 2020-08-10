package a20_6_30;
//평균을 구하고 평균이 90이상이면 "A학점" 80이상이면 "B학점"70이상이면 "C학점"60이상이면 "D학점" 그 외는 "F학점"
//switch-case문으로 작성할 것
public class ch04ex03 {
	public static void main(String[] args) {
		int kor=100, mat=100, eng=100;
		int avg;
		avg=(kor+mat+eng)/3;
		switch (avg/10) { // 조건식
		case 10: // 조건식에 대한 값, break 가 없기 때문에 case 9로 이어짐
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			break;
		}
	}

}
