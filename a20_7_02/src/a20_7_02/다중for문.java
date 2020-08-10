package a20_7_02;

public class 다중for문 {
public static void main(String[] args) {
	int cnt=0;
	for(int a=1; a<=3;a++) {						 //3회
		for(int b=1; b<=2;b++) {					 //2회
			cnt= cnt+1;
			System.out.println(cnt+ "번 돌아요");  //6회
		}
	}
}
}
