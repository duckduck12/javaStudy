package chapter28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

class SwingWindowFrame2 extends WindowAdapter implements ActionListener {
	
	private JFrame f;
	private JButton b;

	public SwingWindowFrame2() {
		f = new JFrame("windowadapter 테스트");
		b = new JButton("제목바꾸기");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);
		
		b.addActionListener(this);
		
		f.addWindowListener(this);
		
		f.setSize(300,100);
		
		f.show();
	}
	
	public void actionPerformed(ActionEvent e) {
		f.setTitle("WindowAdapter, ActionAdapter");
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}

public class SwingWindowFrameMain2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingWindowFrame2();

	}

}
