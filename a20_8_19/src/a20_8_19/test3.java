package a20_8_19;

import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;

public class test3 extends Applet {
	Label lbl1, lbl2;
	TextField txt1, txt2;

	public void init() {

		lbl1 = new Label("NAME");
		lbl2 = new Label("ID");
		txt1 = new TextField(15);
		txt2 = new TextField(15);

		this.add(lbl1);
		this.add(txt1);

		this.add(lbl2);
		this.add(txt2);
	}

	public void start() {
txt1.setText("ȫ�浿");
txt2.setText("HONGGD");
	}
}
