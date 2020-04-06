package chapter28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingActionFrameMain2 implements ActionListener {
	
	private JFrame f;
	private JButton b = new JButton("종료하기");
	
	public SwingActionFrameMain2() {
		f = new JFrame("Event테스트");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);
		
		b.addActionListener(this);
		f.setSize(300, 100);
		f.show();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingActionFrameMain2();

	}

}
