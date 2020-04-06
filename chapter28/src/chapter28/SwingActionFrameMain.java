package chapter28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class SwingActionFrame extends JFrame implements ActionListener {

	private JButton b = new JButton("종료하기");

	public SwingActionFrame() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);
		
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}

public class SwingActionFrameMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new SwingActionFrame();
		f.setSize(300, 100);
		f.show();

	}

}