package a20_7_01;
public class SumandCn3ebaesoo {
	/*a�� 1���� 100���� 1�� �����ϵ�,
	 ¦���� ã�Ƽ� ����Ͻÿ�*/
	public static void main(String[] args)
	{	int a;
		int sum=0,cn=0;
		for(a=1;a<=100;a++)
		{	if(a%3==0)
			{	sum=sum+a;
				cn=cn+1;
			}
		}
		System.out.println("�հ� : " + sum);
		System.out.println("���� : " + cn);
		System.out.println("��� : " + (double)sum/cn);
	}
}