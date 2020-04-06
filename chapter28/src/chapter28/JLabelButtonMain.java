package chapter28;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JLabelJButton implements ActionListener {
	private JFrame f;
	private JLabel msn;
	private JButton imageb, textb, btnMemo;
	private ImageIcon image, smile;

	public JLabelJButton() {
		f = new JFrame("이미지가 추가된 레이블, 버튼");
		Container c = f.getContentPane();
		c.setLayout(new FlowLayout());

		image = new ImageIcon("./image/msn.png");
		smile = new ImageIcon("./image/smile.png");

		msn = new JLabel("MSN", image, JLabel.CENTER);
		imageb = new JButton(smile);
		imageb.setToolTipText("클릭해주세요");

		textb = new JButton("기상청접속");
		textb.addActionListener(this);
		textb.setToolTipText("클릭해주세요");

		btnMemo = new JButton("메모장열기");
		btnMemo.addActionListener(this);
		btnMemo.setToolTipText("클릭해주세요");

		c.add(msn);
		c.add(imageb);
		c.add(textb);
		c.add(btnMemo);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 300);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();

		System.out.println("jb : " + jb);
		
		if(jb == textb) {
			
			try {
				Runtime rt = Runtime.getRuntime();
				rt.exec("c:\\program files\\internet explorer\\iexplore.exe http://www.kma.go.kr");
				
			}
			catch(Exception ex) {
				System.out.println(ex.toString());
			}
			finally {
				
			}
		}
		
		if(jb == btnMemo) {
			try {
				Runtime rt = Runtime.getRuntime();
				rt.exec("c:\\windows\\notepad.exe");
			}
			catch(Exception ex) {
				System.out.println(ex.toString());
			}
			finally {
				
			}
		}
	}
}

public class JLabelButtonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelJButton();

	}

}
