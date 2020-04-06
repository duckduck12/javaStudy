package chapter28;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

class SwingGraphicsFrame extends JFrame {
	public SwingGraphicsFrame() {
		this.setTitle("Hello World!");
	}
	
	public void paint(Graphics g) {
		
		// g.setColor(Color.white);
		g.drawString("Hello World!", 50, 50);
	}
}

public class SwingGraphicsFrameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new SwingGraphicsFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200,100);
		f.setVisible(true);

	}

}
