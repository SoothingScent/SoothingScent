package a20_8_20_awt;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;

public class LabelTest extends Applet {

	Label lbl1, lbl2, lbl3;
	public void init() {
		lbl1 = new Label("C++");
		lbl2 = new Label();
		lbl3 = new Label("jsp", Label.CENTER);
		
		lbl2.setText("Java");
		lbl1.setBackground(Color.magenta);
		lbl2.setBackground(new Color(255,0,0));
		lbl3.setBackground(Color.cyan);
		lbl1.setAlignment(Label.CENTER);
		lbl2.setAlignment(Label.CENTER);
		
		add(lbl1);
		add(lbl2);
		add(lbl3);
	}
	public void start(){
		
	}
}
