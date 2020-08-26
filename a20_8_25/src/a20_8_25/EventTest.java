package a20_8_25;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventTest extends Applet implements MouseListener, MouseMotionListener {
	Label lbl1;
	TextArea ta;
	int num = 0;
	int x[], y[];

	public void init() {
		this.setLayout(null);
		this.setSize(600, 500);
		lbl1 = new Label("±×¸²ÆÇ");
		this.add(lbl1);
		lbl1.setBounds(10, 10, 300, 30);
		num = 0;
		x = new int[1000000];
		y = new int[1000000];
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public void paint(Graphics g) {
		g.setColor(new Color(0, 0, 0));
		for (int i = 0; i < num; i++) {
			g.fillOval(x[i] - 1, y[i] - 1, 2, 2);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (num < 1000000) {
			x[num] = e.getX();
			y[num] = e.getY();
			num++;
		}
		repaint();
		/*
		 * if (num < 100) { x[num] = e.getX(); y[num] = e.getY(); num++; }
		 */
		/* repaint(); */
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if (num < 1000000) {
			x[num] = e.getX();
			y[num] = e.getY();
			num++;
		}
		repaint();

	}

	@Override
	public void mouseMoved(MouseEvent e) {

		// System.out.print(e.getX());
		// System.out.println(", " + e.getY());

	}
}
