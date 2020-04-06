package chapter28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class SwingWindowFrame implements ActionListener, WindowListener{
	JFrame f;
	private JButton b;
	
	public SwingWindowFrame() {
		f = new JFrame("Window Event 테스트");
		b = new JButton("제목 바꾸기");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);
		
		b.addActionListener(this);
		f.addWindowListener(this);
		
		f.setSize(300, 100);
		f.show();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		f.setTitle("액션리스너와 윈도우리스너");
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class SwingWindowFrameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingWindowFrame();
	}

}
