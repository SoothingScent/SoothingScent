package a20_7_01;

public class if_maxandmin {
	public static void main(String[] args) {
		int a,b,c,d,e,max,min;
		a=100;b=300;c=400;d=450;e=80;
		max=min=a;
		if(b>max) max=b; //else�ϰ�� ���� if�� ����
		if(c>max) max=c;
		if(d>max) max=d;
		if(e>max) max=e;
				System.out.println("�ִ밪 = " + max);
				
		if(min>b) min=b;
		if(min>c) min=c;
		if(min>d) min=d;
		if(min>e) min=e;
				System.out.println("�ּҰ� = " + min);
	}

}
