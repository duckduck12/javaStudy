package chapter28;

import javax.swing.JFrame;

public class JFrameTest {

	private JFrame frame;
	
	public JFrameTest() { 
		frame = new JFrame("JFrame");
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameTest jt = new JFrameTest();

	}

}
