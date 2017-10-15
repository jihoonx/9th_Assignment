package 9th_Assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends JFrame implements MouseListener, MouseMotionListener {
	public MyFrame2() {
		setTitle("Mouse Event");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		add(panel);
		setVisible(true);
	}
	public void mousePressed(MouseEvent e){ //눌렸을때
		display("Mouse pressed (# of clicks: "+ e.getClickCount() + ")", e);
	}
	public void mouseReleased(MouseEvent e){ //떼어졌을때
        display("Mouse released (# of clicks: " + e.getClickCount() + ")", e);
	}
	public void mouseEntered(MouseEvent e){ //컴포넌트에 들어갔을때
        display("Mouse entered", e);
	}
	public void mouseExited(MouseEvent e){ //컴포넌트에서 나왔을때
        display("Mouse exited", e);
	}
	public void mouseClicked(MouseEvent e){ //클릭됐을때(눌리고 떼어졌을때)
		display("Mouse clicked (# of clicks: " + e.getClickCount() + ")", e);
	}
	
    protected void display(String s, MouseEvent e) {
        System.out.println(s + " X=" + e.getX() + " Y=" + e.getY());
    }

    public void mouseDragged(MouseEvent e) {
        display("Mouse dragged", e);
    }
    public void mouseMoved(MouseEvent e) {
        display("Mouse moved", e);
        
    }

}
public class MyFrameTest {

	public static void main(String[] args) {
		new MyFrame2();

	}

}
