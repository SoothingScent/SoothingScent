package »ó¼Ó;

public class circle extends shape {
private int r;
public circle() {
}
	
public circle(int r) {
	this.r=r;
}
public void calcir() {
	res=r*r*(int)Math.PI;
}
public void show() {
	System.out.println(res);
}
}
