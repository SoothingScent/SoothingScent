package a20_8_20_awt;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnTest extends Applet implements ActionListener {
	private Button btn1, btn2, btn3;

	public void init() {
		btn1 = new Button();
		btn2 = new Button("C++");
		btn3 = new Button("Java");

		btn1.setLabel("C");
		btn2.setLabel("Python");

		btn1.setBackground(Color.yellow);
		btn2.setBackground(new Color(150, 150, 255));
		btn3.setBackground(new Color(255, 200, 255));

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);

		btn1.addActionListener(this);
		/*
		 * btn2.addActionListener(this); btn3.addActionListener(this);
		 */
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		btn1.setBackground(new Color(0, 255, 0));
	}
}
