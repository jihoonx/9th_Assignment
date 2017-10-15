package 9th_Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel4 extends JPanel implements MouseMotionListener{
	private int index = 0;
	Point[] array = new Point[1000];
	public MyPanel4() {
		this.addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent e){ //���콺�� Ŭ�� �� �����϶�
		int x = e.getX();
		int y = e.getY();
		if(index > 1000)
			return;
		array[index] = new Point();
		array[index].x = x;
		array[index].y = y;
		index++;
		repaint();
	}
	public void mouseMoved(MouseEvent e){} //���콺�� �����϶�(Ŭ��x)
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Point p : array){
			if(p != null)
				g.drawRect(p.x, p.y, 1,1); //x,y��ġ�� 1*1������ �簢�� �׸�
		}
	}
	
}
public class Scribble extends JFrame{
	public Scribble() {
		setSize(300,300);
		setTitle("���콺�� �׸� �׸���");
		add(new MyPanel4());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Scribble();
	}

}
