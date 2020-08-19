package a20_8_19;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class test1 extends Applet {
	public void destroy() {
		System.out.println("꺼짐");
	}

	public void init() {
		System.out.println("초기");
	}

	public void start() {
		System.out.println("스타트");

	}

	public void stop() {
		System.out.println("멈춤");

	}

	@Override
	public void paint(Graphics g) {
		Font f = new Font("궁서체", Font.BOLD, 15);
		Color c = new Color(255,0,0);
		g.setColor(c);
		g.setFont(f);
		g.drawString("대한민국", 100, 100);	
		Color c2=Color.BLUE;
		Font f2=new Font("휴먼매직체",Font.BOLD+Font.ITALIC, 18);
		g.setColor(c2);
		g.setFont(f2);
g.drawString("애플릿연습", 100, 200);	}
	
	
}
