package 9th_Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class RockPaperScissor extends JFrame implements ActionListener{
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSOR = 2;
	private JPanel panel;
	private JTextField output, information;
	private JButton rock, paper, scissor;
	public RockPaperScissor() {
		setTitle("����, ����, ��");
		setSize(400,300);
		information = new JTextField("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�!");
		add(information,BorderLayout.NORTH);
		rock = new JButton("ROCK");
		paper = new JButton("PAPER");
		scissor = new JButton("SCISSOR");
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		add(panel, BorderLayout.CENTER);
		output = new JTextField(20);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		Random random = new Random();
		int computer = random.nextInt(3); //0,1,2 ����.
		if(e.getSource() == rock) {
			if(computer == SCISSOR)
				output.setText("����� �¸�");
			else if(computer == ROCK)
				output.setText("�����");
			else
				output.setText("��ǻ�� �¸�");
		}
		if(e.getSource() == paper) {
			if(computer == SCISSOR)
				output.setText("��ǻ�� �¸�");
			else if(computer == ROCK)
				output.setText("����� �¸�");
			else
				output.setText("�����");
		}
		if(e.getSource() == scissor) {
			if(computer == SCISSOR)
				output.setText("�����");
			else if(computer == ROCK)
				output.setText("��ǻ�� �¸�");
			else
				output.setText("����� �¸�");
		}
	}
	public static void main(String[] args) {
		new RockPaperScissor();

	}

}
