package »ó¼Ó;

public class rectangle extends shape {
private int w,h;
public rectangle() {
	
}
public rectangle(int w, int h) {
	this.w = w;
	this.h = h ;
}
public void calrec() {
	res=w*h;
}
public void show() {
	System.out.println(res);
}
}
