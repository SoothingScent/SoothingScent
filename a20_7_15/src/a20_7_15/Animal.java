package a20_7_15;

public class Animal {
private String name;
private int age;
public void show() {
	System.out.println("�̸� = "+name);
	System.out.println("���� = "+age);
}
public Animal() {
	name=null;
	age=0;
}
public Animal(String name, int age) {
	this.name=name;
	this.age=age;
}
public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age=age;
}
}
