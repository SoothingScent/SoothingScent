package a20_6_26;

public class ch02ex07 {
public static void main(String[] args) {
int a = 0b1010, b = 0b0011;
//System.out.println(a&&b); //error ( 논리연산자)
//System.out.println(a||b);//error (논리연산자)
System.out.println(a&b);//(비트연산자 & and) 2 
System.out.println(a|b);//(비트연산자 | or) 11
System.out.println(a>b && b==3);

/*
 * 비트연산자 & , | 비트로 변경 후 and 와 or 을 수행
 * a = 10 -> 1010
b = 3 -> 0011
& : and = 0010(2)  * 둘 다
| : or = 1011(11)  * 둘 중 하나라도
*/

}
}
