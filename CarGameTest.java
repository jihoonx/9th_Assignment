package 9th_Assignment;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*; //버퍼이미지 설정할수 있게 함.
import java.io.*; //File 만들수 있게 함.
import javax.imageio.ImageIO;
import javax.swing.*;

class MyPanel extends JPanel implements KeyListener{
	BufferedImage img = null;	
	int img_x = 100, img_y = 100;
	public MyPanel() {
		try {
			img = ImageIO.read(new File("car.gif"));
		} catch (IOException e) {	
			System.out.println("no image");
			System.exit(1);
		}
		this.addKeyListener(this);
		
		this.requestFocus(); 	// Requests that this Component gets the input focus.
		setFocusable(true);	// Sets the focusable state of this Component to the specified value.
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null); 
	}
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		switch (keycode) {
		case KeyEvent.VK_UP:		img_y -= 10;	break;
		case KeyEvent.VK_DOWN:	img_y += 10;	break;
		case KeyEvent.VK_LEFT:		img_x -= 10;	break;
		case KeyEvent.VK_RIGHT:	img_x += 10;	break;
		}
		repaint();
	} 
	public void keyReleased(KeyEvent arg0) {		}
	public void keyTyped(KeyEvent arg0) {		}
}
public class CarGameTest extends JFrame {
	public CarGameTest() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		CarGameTest s = new CarGameTest();
	}
}

