package a20_7_02;
/*while(����){	}
do{��}while(����)*/
public class while�� 
//1���� 100���� ��� + �� �հ踦 ���Ͻÿ�
//5�� ����� ������ ���Ͻÿ�
{	public static void main(String[] args) 
	{	int a = 1; int sum = 0; int cnt=0; int na;
		while(a<=100) 
		{	sum=sum+a;
			System.out.println(a);
			na=a-a/5*5;
			if(na==0) 
			{cnt = cnt+1;}
			a++;
		}
	System.out.println("�հ� : " + sum);
	System.out.println("5�� ��� ���� : " + cnt);
	}
}
