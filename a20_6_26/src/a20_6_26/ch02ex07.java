package a20_6_26;

public class ch02ex07 {
public static void main(String[] args) {
int a = 0b1010, b = 0b0011;
//System.out.println(a&&b); //error ( ��������)
//System.out.println(a||b);//error (��������)
System.out.println(a&b);//(��Ʈ������ & and) 2 
System.out.println(a|b);//(��Ʈ������ | or) 11
System.out.println(a>b && b==3);

/*
 * ��Ʈ������ & , | ��Ʈ�� ���� �� and �� or �� ����
 * a = 10 -> 1010
b = 3 -> 0011
& : and = 0010(2)  * �� ��
| : or = 1011(11)  * �� �� �ϳ���
*/

}
}
