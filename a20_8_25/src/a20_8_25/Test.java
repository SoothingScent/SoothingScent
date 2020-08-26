package a20_8_25;

import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test extends Applet implements ActionListener, ItemListener {
	JTextField txt1, txt2;
	JButton btn1, btn2;
	JLabel lbl1, lbl2;
	public void init() {
		this.setLayout(null);
		this.setSize(230,350);
		lbl1 = new JLabel("이름");
		lbl2 = new JLabel("전화번호");
		lbl1.setBounds(10,10,60,20);
		lbl2.setBounds(10,40,60,20);
		this.add(lbl1);
		this.add(lbl2);
		
		txt1 = new JTextField("");
		txt2 = new JTextField("");
		txt1.setBounds(100,10,120,20);
		txt2.setBounds(100,40,120,20);
		this.add(txt1);
		this.add(txt2);
		
		btn1 = new JButton("전송");
		btn2 = new JButton("취소");
		btn1.setBounds(70,80,70,20);
		btn2.setBounds(150,80,70,20);
		this.add(btn1);
		this.add(btn2);
		
		txt1.addActionListener(this);
		txt2.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}

	public void itemStateChanged(ItemEvent e) {

	
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn1) {
			System.out.println(txt1.getText());
			System.out.println(txt2.getText());
		} else if (e.getSource()==btn2){
			txt1.setText("");
			txt2.setText("");
		}
	}
}
