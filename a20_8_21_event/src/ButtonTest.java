import java.applet.Applet;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest extends Applet implements ActionListener {
	Button btn1, btn2, btn3;
	TextArea TA;

	public void init() {
		this.setLayout(null);
		btn1 = new Button();
		btn2 = new Button();
		btn3 = new Button();
		btn1.setBounds(2, 10, 50, 50);
		btn2.setBounds(64, 10, 50, 50);
		btn3.setBounds(126, 10, 50, 50);
		btn1.setLabel("JAVA");
		btn2.setLabel("JSP");
		btn3.setLabel("C++");
		TA = new TextArea(8, 20);
		TA.setBounds(2, 100, 180, 100);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(TA);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			btn1.disable();
			btn2.enable();
			btn3.enable();
			TA.append("ÀÚ¹Ù : ");
			TA.append(btn1.getLabel() + "\n");
		} else if (e.getSource() == btn2) {
			btn2.disable();
			btn1.enable();
			btn3.enable();
			TA.append("JSP : ");
			TA.append(btn2.getLabel() + "\n");

		}else if (e.getSource()==btn3) {
			btn3.disable();
			btn2.enable();
			btn1.enable();
			TA.append("C++ : ");
			TA.append(btn3.getLabel()+"\n");
		}
	}
}
