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
	public void mousePressed(MouseEvent e){ //컴포넌트에서 눌렸을때
		if(index > 100)
			return;
		array[index] = new Rectangle();
		array[index].x = e.getX(); //x위치
		array[index].y = e.getY(); //y위치
		array[index].w = 50; //가로
		array[index].h = 50; //세로
		index++;
		repaint();
	}
	public void mouseReleased(MouseEvent e){} //떼었을때
	public void mouseClicked(MouseEvent e){} //클릭시
	public void mouseEntered(MouseEvent e){} //컴포넌트에 들어갔을때
	public void mouseExited(MouseEvent e){} //컴포넌트에서 나왔을때
	
}
public class MouseEventTest2 extends JFrame{
	public MouseEventTest2(){
		setSize(300,300);
		setTitle("마우스로 사각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel3());
		setVisible(true);
	}
	public static void main(String[] args){
		new MouseEventTest2();
	}
}
