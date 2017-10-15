package 9th_Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyButton extends JButton {
	static int count=0;
	int index;
	public MyButton(String s){
		super(s); //버튼이름 입력
		index = count++; //index = 0부터 입력됨.
	}
}
public class Puzzle extends JFrame implements ActionListener{
	MyButton[] buttons;
	MyButton reset;
	public Puzzle() {
		super("puzzle");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,3,2,2));
		buttons = new MyButton[9];
		for(int i=0;i<8;i++)
			buttons[i] = new MyButton("" + (i+1));
		buttons[8] = new MyButton(" ");
		for(int i=0;i<9;i++){
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		add(panel,BorderLayout.CENTER);
		reset = new MyButton("reset");
		reset.addActionListener(this);
		reset.setBackground(Color.red);
		reset.setForeground(Color.yellow);
		add(reset, BorderLayout.SOUTH);

		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		MyButton b = (MyButton) e.getSource();
		if(b.getText().equals(" ") == true)
			return;
		switch(b.index){
		case 0:
			if(buttons[1].getText().equals(" ")){
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[3].getText().equals(" ")){
				buttons[3].setText(b.getText());
				b.setText(" ");
			}
			break;

		case 1:
			if(buttons[0].getText().equals(" ")){
				buttons[0].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[2].getText().equals(" ")){
				buttons[2].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[4].getText().equals(" ")){
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			break;
			
		case 2:
			if(buttons[1].getText().equals(" ")){
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[5].getText().equals(" ")){
				buttons[5].setText(b.getText());
				b.setText(" ");
			}
			break;

		case 3:
			if(buttons[0].getText().equals(" ")){
				buttons[0].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[4].getText().equals(" ")){
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[6].getText().equals(" ")){
				buttons[6].setText(b.getText());
				b.setText(" ");
			}
			break;

		case 4:
			if(buttons[1].getText().equals(" ")){
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[3].getText().equals(" ")){
				buttons[3].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[5].getText().equals(" ")){
				buttons[5].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[7].getText().equals(" ")){
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
			break;

		case 5:
			if(buttons[2].getText().equals(" ")){
				buttons[2].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[4].getText().equals(" ")){
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[8].getText().equals(" ")){
				buttons[8].setText(b.getText());
				b.setText(" ");
			}
			break;
		case 6:
			if(buttons[3].getText().equals(" ")){
				buttons[3].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[7].getText().equals(" ")){
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
			break;
		case 7:
			if(buttons[4].getText().equals(" ")){
				buttons[4].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[6].getText().equals(" ")){
				buttons[6].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[8].getText().equals(" ")){
				buttons[8].setText(b.getText());
				b.setText(" ");
			}
			break;
		case 8:
			if(buttons[5].getText().equals(" ")){
				buttons[5].setText(b.getText());
				b.setText(" ");
			}
			else if(buttons[7].getText().equals(" ")){
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
			break;
		case 9:
			for(int i=0;i<8;i++){
				buttons[i].setText("" + (i+1));
			}
			buttons[8].setText(" ");
			break;
		}
	}
	public static void main(String[] args) {
		new Puzzle();
	}

}
