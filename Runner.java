import java.util.Scanner;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Runner extends JFrame implements KeyListener{
	
	JLabel label;

    public Runner(String s) {
        super(s);
        JPanel p = new JPanel();
        label = new JLabel("Snake!");
        p.add(label);
        add(p);
        addKeyListener(this);
        setSize(500, 500);
        setVisible(true);

    }
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		 if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	            System.out.println("Right key typed");
	     }
	     if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	            System.out.println("Left key typed");
	     }
	     if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	            System.out.println("Down key typed");
	     }
	     if (e.getKeyCode() == KeyEvent.VK_UP) {
	            System.out.println("Up key typed");
	     }
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key pressed");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	            System.out.println("Left key pressed");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	            System.out.println("Down key pressed");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_UP) {
	            System.out.println("Up key pressed");
	    }
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key released");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	            System.out.println("Left key released");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	            System.out.println("Down key released");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_UP) {
	            System.out.println("Up key released");
	    }
		
	}
	

	public static void main(String[] args) {
		new Runner("Key Listener Tester");

	}
}
