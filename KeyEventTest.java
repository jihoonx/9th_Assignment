package 9th_Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTest extends JFrame implements KeyListener{
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	public KeyEventTest() {
		setSize(400,200);
		setTitle("KeyEvnet Test");
		
		panel = new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("���ڸ� �Է��Ͻÿ�:"));
		field = new JTextField(10);
		field.addKeyListener(this);
		panel.add(field);
		add(panel,BorderLayout.NORTH);
		area = new JTextArea(3,30); //3�� 30�ڸ���
		add(area,BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void keyTyped(KeyEvent e){
		display(e, "Key Typed");
	}
	public void keyPressed(KeyEvent e){
		display(e, "Key Pressed");
	}
	public void keyReleased(KeyEvent e){
		display(e, "Key Released");
	}
	protected void display(KeyEvent e, String s){
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		area.append(s+"\t����"+c+"(�ڵ�:"+keyCode+")\tAlt:"+e.isAltDown()
					+" Ctrl:"+e.isControlDown()+" Shift:"+e.isShiftDown()+"\n");
	}
	public static void main(String[] args) {
		new KeyEventTest();

	}

}
