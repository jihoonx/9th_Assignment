package 9th_Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Rectangle {
	int x, y, w, h;
}
class MyPanel3 extends JPanel implements MouseListener {
	Rectangle[] array = new Rectangle[100];
	int index = 0;
	public MyPanel3() {
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Rectangle r : array){
			if(r != null)
				g.drawRect(r.x,r.y,r.w,r.h);
		}
	}
	public void mousePressed(MouseEvent e){ //������Ʈ���� ��������
		if(index > 100)
			return;
		array[index] = new Rectangle();
		array[index].x = e.getX(); //x��ġ
		array[index].y = e.getY(); //y��ġ
		array[index].w = 50; //����
		array[index].h = 50; //����
		index++;
		repaint();
	}
	public void mouseReleased(MouseEvent e){} //��������
	public void mouseClicked(MouseEvent e){} //Ŭ����
	public void mouseEntered(MouseEvent e){} //������Ʈ�� ������
	public void mouseExited(MouseEvent e){} //������Ʈ���� ��������
	
}
public class MouseEventTest2 extends JFrame{
	public MouseEventTest2(){
		setSize(300,300);
		setTitle("���콺�� �簢�� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel3());
		setVisible(true);
	}
	public static void main(String[] args){
		new MouseEventTest2();
	}
}
