package 9th_Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ChangeBackground extends JFrame {
	JButton button1;
	JButton button2;
	JPanel panel;
	MyListener listener = new MyListener();
	public ChangeBackground() {
		setTitle("�̺�Ʈ ����");
		setSize(300, 200);
		button1 = new JButton("�����");
		button2 = new JButton("��ũ��");
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(button1);
		panel.add(button2);
		
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == button1)
				panel.setBackground(Color.YELLOW);
			else if(e.getSource() == button2)
				panel.setBackground(Color.PINK);
		}
	}
	public static void main(String[] args) {
		new ChangeBackground();

	}

}
