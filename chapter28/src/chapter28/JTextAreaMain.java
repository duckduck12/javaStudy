package chapter28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;

class JTextAreaTest implements ActionListener{
	
	private JFrame f;
	private JButton btnOK;
	private JTextArea jta;
	private JScrollPane jcp;
	JViewport vp;
	
	
	public JTextAreaTest() {
		
		vp = new JViewport();
		f = new JFrame("TestArea");
		
		Container c =f.getContentPane();
		c.setLayout(new FlowLayout());
		
		btnOK = new JButton("Ȯ��");
		btnOK.addActionListener(this);
		c.add(btnOK);
		
		jta = new JTextArea(6, 30);
		jta.setFont(new Font("�ü�ü", Font.BOLD, 12));
		jta.setText("JTextArea �����Դϴ�");
		jta.setLineWrap(true);
		vp.add(new JScrollPane(jta));
		c.add(vp);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250, 180);
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		JButton jb = (JButton)e.getSource();
		
		if(jb == btnOK) {
			try {
				StringBuffer s = new StringBuffer();
				
				s.append("�Ѱܿ��Դϴ�.");
				s.append("������ �谡 ������. ");
				s.append("�Ѱܿ��Դϴ�.");
				s.append("������ �谡 ������. ");
				s.append("�Ѱܿ��Դϴ�.");
				s.append("������ �谡 ������. ");
				s.append("�Ѱܿ��Դϴ�.\n");
				s.append("������ �谡 ������. \n");
				
				jta.setText(s.toString());
				jta.append("~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				jta.append("--------------------------\n");
				
			}
			catch(Exception ex) {
				System.out.println(ex.toString());
			}
			finally {
				
			}
		}
	}
}

public class JTextAreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaTest();

	}

}
