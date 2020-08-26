package a20_8_25;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameTest extends Frame implements WindowListener {
public static void main(String[] args) {
	FrameTest fr = new FrameTest();
	fr.setVisible(true);
	fr.setTitle("위대한 자바");
	fr.setBounds(10,20,500,300);
	fr.addWindowListener(fr);
	Label lbl1;
	lbl1 = new Label("이름");
	fr.add(lbl1);
}

@Override
public void windowActivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
}

@Override
public void windowClosing(WindowEvent e) {
	// TODO Auto-generated method stub
	System.exit(0);
}

@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
}
}
