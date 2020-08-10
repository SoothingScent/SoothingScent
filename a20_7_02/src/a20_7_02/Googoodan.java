package a20_7_02;

//2단~9단까지 구구단 출력 + 5단(dan)을 입력받아서 5단의 구구단을 출력하시오
public class Googoodan 
{
	public static void main(String[] args) 
	{	for(int dan=2; dan<=9; dan++) 
		{System.out.println(dan+"단");
			for(int n=1; n<=9; n++) 
			{System.out.print(dan+" * "+n+" = "+(dan*n)+"\t");
			}		System.out.println();
		}
	System.out.println("끝");
	}
}
