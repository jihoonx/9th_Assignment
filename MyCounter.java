package 9th_Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyCounter extends JFrame implements ActionListener{
	private JLabel label1, label2;
	private JButton button;
	private int count = 0;
	public MyCounter() {
		setTitle("My Counter");
		setSize(300,200);
		JPanel panel = new JPanel();
		label1 = new JLabel("Counter");
		label2 = new JLabel("0");
		label2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel.add(label1);
		panel.add(label2);
		JButton button = new JButton("카운터 증가");
		button.addActionListener(this);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		label2.setText(""+ (++count));
			
	}
	public static void main(String[] args) {
		new MyCounter();
	}

}
