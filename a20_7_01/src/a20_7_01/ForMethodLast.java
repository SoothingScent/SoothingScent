package a20_7_01;

public class ForMethodLast
{
	public static void main(String[] args)
	{	int i=1;//초기값
		for(;;) //무조건 돈다, 무한반복
		{
			if(i>100) break;//종료조건
			i++; // 1씩증가
		}
		System.out.println(i);
	}

}
