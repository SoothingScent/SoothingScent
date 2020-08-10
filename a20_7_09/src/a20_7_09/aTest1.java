package a20_7_09;

public class aTest1 {
	public static void main(String[] args) {
		int a[][]=new int[3][]; //행의 갯수 3개, 열의 갯수x
		a[0]= new int[2]; //0행일때 2개
		a[1]= new int[3];//1행일때 3개
		a[2]= new int[4];//2행일때 4개 //행마다 열의 갯수가 다름
		System.out.println(a.length);//행의 갯수
		System.out.println(a[0].length);//첫번째 행의 열 갯수
		System.out.println(a[1].length);//두번째 행의 열 갯수
		System.out.println(a[2].length);//세번째 행의 열 갯수
	}
}
