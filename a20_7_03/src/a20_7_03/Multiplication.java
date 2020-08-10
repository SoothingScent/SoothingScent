package a20_7_03;

public class Multiplication {
public static void main(String[] args) {
	int n=0x1, h=0x1;
	do
	{	n++;
		h=h*n;
	}while(n<100);
System.out.println(h);//0이 나오는 이유는 숫자가 너무 큼
}
}
