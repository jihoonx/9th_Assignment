package Assignment_9th;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyPanel1 extends JPanel implements ActionListener {
	boolean flag = false;
	private int light_number= 0;
	public MyPanel1() {
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic light turn on");
		b.addActionListener(this);
		add(b,BorderLayout.SOUTH);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100,100,100,100); //첫번째 원
		g.drawOval(100,200,100,100); //x, y, width, height
		g.drawOval(100,300,100,100);
		
		if(light_number == 0){
			g.setColor(Color.RED);
			g.fillOval(100,100,100,100);
		}
		else if(light_number == 1) {
			g.setColor(Color.YELLOW);
			g.fillOval(100,200,100,100);
		}
		else {
			g.setColor(Color.GREEN);
			g.fillOval(100,300,100,100);
		}
	}
	public void actionPerformed(ActionEvent e){
		if(++light_number >= 3)
			light_number = 0;
		repaint();
	}
}
public class MyFrame extends JFrame{
	public MyFrame() {
		add(new MyPanel1());
		setSize(300,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();

	}

}
