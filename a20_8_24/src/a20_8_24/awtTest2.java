package a20_8_24;
//
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class awtTest2 extends Applet implements AdjustmentListener {
	Label lbl1, lbl2, lbl3;
	Scrollbar sc1, sc2, sc3;
	TextField tf1,tf2,tf3;
	int R,G,B;
	
public void init() {
	this.setLayout(null);
	this.setSize(650,400);
	R=G=B=0;
	lbl1 = new Label("Red");
	lbl2 = new Label("Green");
	lbl3 = new Label("Blue");
	lbl1.setBounds(150,10,50,20);
	lbl2.setBounds(300,10,50,20);
	lbl3.setBounds(450,10,50,20);
	this.add(lbl1);
	this.add(lbl2);
	this.add(lbl3);
	
	sc1 = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
	sc2 = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
	sc3 = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
	sc1.setBounds(90,40,150,20);
	sc2.setBounds(240,40,150,20);
	sc3.setBounds(390,40,150,20);
	this.add(sc1);
	this.add(sc2);
	this.add(sc3);
	sc1.addAdjustmentListener(this);
	sc2.addAdjustmentListener(this);
	sc3.addAdjustmentListener(this);
	
	tf1 = new TextField(10);
	tf2 = new TextField(10);
	tf3 = new TextField(10);
	tf1.setBounds(267,350,30,20);
	tf2.setBounds(297,350,30,20);
	tf3.setBounds(327,350,30,20);
	tf1.setText("0");
	tf2.setText("0");
	tf3.setText("0");
	this.add(tf1);
	this.add(tf2);
	this.add(tf3);
}
public void paint(Graphics g) {
	g.setColor(new Color(R,G,B));
	g.fillOval(210,100,200,200);
}
@Override
public void adjustmentValueChanged(AdjustmentEvent e) {
	if(e.getSource()==sc1) {
		tf1.setText(sc1.getValue()+"");
		R=sc1.getValue();
	}
	else if(e.getSource()==sc2) {
		tf2.setText(sc2.getValue()+"");
		G=sc2.getValue();
	}
	else if(e.getSource()==sc3) {
		tf3.setText(sc3.getValue()+"");
		B=sc3.getValue();
	}
	repaint();
}
}
