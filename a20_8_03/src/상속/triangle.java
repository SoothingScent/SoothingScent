package »ó¼Ó;

public class triangle extends shape {
private int w,h;
public triangle() {
	
}
public triangle(int w, int h) {
	this.w = w;
	this.h = h ;
}
public void caltri() {
	res=(w*h)/2;
}
public void show() {
	System.out.println(res);
}
}
