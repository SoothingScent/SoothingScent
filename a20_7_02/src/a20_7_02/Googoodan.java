package a20_7_02;

//2��~9�ܱ��� ������ ��� + 5��(dan)�� �Է¹޾Ƽ� 5���� �������� ����Ͻÿ�
public class Googoodan 
{
	public static void main(String[] args) 
	{	for(int dan=2; dan<=9; dan++) 
		{System.out.println(dan+"��");
			for(int n=1; n<=9; n++) 
			{System.out.print(dan+" * "+n+" = "+(dan*n)+"\t");
			}		System.out.println();
		}
	System.out.println("��");
	}
}
