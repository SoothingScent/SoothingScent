package a20_8_24;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Label;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class awtTest1 extends Applet implements TextListener, ActionListener, ItemListener, AdjustmentListener {
	Label lbl1, lbl2;
	Button btn1, btn2;
	TextField txt1, txt2;
	TextArea ta;
	Checkbox chk1, chk2, chk3, chk4;
	CheckboxGroup cg;
	Choice ch;
	List list;
	Scrollbar sc;

	public void init() {
		this.setLayout(null);
		this.setSize(220, 350);
		lbl1 = new Label("이름");
		lbl1.setBounds(10, 10, 50, 20);
		this.add(lbl1);
		lbl2 = new Label("직업");
		lbl2.setBounds(10, 110, 50, 20);
		this.add(lbl2);

		btn1 = new Button("저장");
		btn2 = new Button("취소");
		btn1.setBounds(65, 35, 50, 20);
		btn2.setBounds(125, 35, 50, 20);
		this.add(btn1);
		this.add(btn2);

		txt1 = new TextField(10);
		txt1.setBounds(60, 10, 120, 20);
		this.add(txt1);

		chk1 = new Checkbox("C++");
		chk2 = new Checkbox("JAVA");
		chk1.setBounds(50, 60, 50, 20);
		chk2.setBounds(100, 60, 50, 20);
		this.add(chk1);
		this.add(chk2);

		cg = new CheckboxGroup();
		chk3 = new Checkbox("남자", cg, false);
		chk4 = new Checkbox("여자", cg, false);
		chk3.setBounds(50, 80, 50, 20);
		chk4.setBounds(100, 80, 50, 20);
		this.add(chk3);
		this.add(chk4);

		ch = new Choice();
		ch.addItem("청소부");
		ch.addItem("의사");
		ch.addItem("학생");
		ch.setBounds(60, 110, 120, 20);
		this.add(ch);
		ta = new TextArea(180, 100);
		ta.setBounds(10, 220, 180, 120);
		this.add(ta);

		sc = new Scrollbar(Scrollbar.VERTICAL, 50, 0, 1, 101);
		sc.setBounds(200, 10, 20, 330);
		this.add(sc);
		list = new List();
		list.add("잠자기");
		list.add("독서");
		list.add("게임");
		list.add("운동");
		list.setBounds(40, 150, 120, 50);
		this.add(list);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		// txt1.addTextListener(this);
		txt1.addActionListener(this);
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		chk4.addItemListener(this);
		ch.addItemListener(this);
		list.addItemListener(this);
		sc.addAdjustmentListener(this);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		if (e.getSource() == txt1) {
			ta.append(txt1.getText() + "\n");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			ta.append(txt1.getText() + "\n");
		} else if (e.getSource() == btn2) {
			txt1.setText("");
		}
		if (e.getSource() == txt1) {
			ta.append(txt1.getText() + "\n");
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chk1 && chk1.getState() == true) {
			ta.append(chk1.getLabel() + "\n");
		} else if (e.getSource() == chk2 && chk2.getState() == true) {
			ta.append(chk2.getLabel() + "\n");
		}
		if (e.getSource() == chk3) {
			ta.append("남자" + "\n");
		} else if (e.getSource() == chk4) {
			ta.append("여자" + "\n");
		}
		if (e.getSource() == ch) {
			ta.append(ch.getSelectedItem() + "\n");
		}
		if (e.getSource() == list) {
			ta.append(list.getSelectedItem() + "\n");
		}
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if (e.getSource() == sc) {
			ta.append(sc.getValue() + "\n");
		}
	}
}
