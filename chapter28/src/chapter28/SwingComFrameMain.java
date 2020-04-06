package chapter28;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class SwingComFrame extends JFrame{
	private JLabel a = new JLabel("레이블테스트");
	private JButton b = new JButton("버튼 테스트");
	private JTextField tf = new JTextField(20);
	
	
	public SwingComFrame() {
		Container c = this.getContentPane();
		
		c.setLayout(new FlowLayout());
		
		c.add(a);
		c.add(b);
		c.add(tf);
	}
} 


public class SwingComFrameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new SwingComFrame();
		f.setSize(300, 150);
		f.show();

	}

}
