package chapter28;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

class SwingShapeFrame extends JFrame {
	public SwingShapeFrame() {
		this.setTitle("Draw Shape!");
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		
		g.setColor(Color.black);
		g.drawString("Draw Shape!", 20, 50);
		
		g.setColor(Color.blue);
		g.drawOval(50, 60, 30, 30);
		
		g.setColor(Color.red);
		g.drawLine(80, 80, 100, 100);
		
		g.setColor(Color.black);
		g.drawRect(70, 100, 50, 50);
		
		g.setColor(Color.cyan);
		g.fillRect(100, 120, 50, 50);
	}
}
public class SwingShapeFrameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new SwingShapeFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200, 100);
		f.setVisible(true);

	}

}
