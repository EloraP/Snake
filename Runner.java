import java.util.Scanner;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Runner extends JFrame implements KeyListener{
	
	JLabel label;
	Snake snake = new Snake();

    public Runner(String s) {
        super(s);
        JPanel p = new JPanel();
        label = new JLabel("KeyListener!");
        p.add(label);
        add(p);
        addKeyListener(this);
        setSize(500, 500);
        setVisible(true);	

    }
    
    
    public static void menu() {
    	JFrame f = new JFrame("Snake");
    	JLabel l = new JLabel("SNAKE!");
    	JButton small, medium, large;
    	
    	small = new JButton("Small");
    	medium = new JButton ("Medium");
    	large = new JButton ("Large");
    	
    	JPanel p = new JPanel();
    	
    	p.add(small);
    	p.add(medium);
    	p.add(large);
    	p.add(l);
    	
    	p.setBackground(Color.cyan);
    	
    	f.add(p);
    	
    	f.setSize(300,300);
    	
    	f.show();
    	
    } 
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		 if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	            snake.move("right");
	     }
	     if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	            snake.move("left");
	     }
	     if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	            snake.move("down");
	     }
	     if (e.getKeyCode() == KeyEvent.VK_UP) {
	            snake.move("up");
	     }
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            snake.move("right");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	            snake.move("left");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	            snake.move("down");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_UP) {
	            snake.move("up");
	    }
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            //System.out.println("Right key released");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	           // System.out.println("Left key released");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	            //System.out.println("Down key released");
	    }
	    if (e.getKeyCode() == KeyEvent.VK_UP) {
	            //System.out.println("Up key released");
	    }
		
	}
	

	public static void main(String[] args) {
		
		menu();
		new Runner("Key Listener Tester");
		
		
		Map mapOne = new Map("mapOne.txt");

	}
}
