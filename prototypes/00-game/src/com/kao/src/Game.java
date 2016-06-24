package com.kao.src;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent; // needed for ActionListener
import java.awt.event.ActionListener; // needed for Timer()

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.kao.src.input.KeyInput;
import com.kao.src.objects.Bullet;
import com.kao.src.objects.Player; // needed for Timer()

/*
 * 1. initiate objects as variables
 * 2. create objects in public Game()
 * 3. draw objects in public void paint(g)
 * 4. draws and update objects in public void actionPerformed(e)
 */

public class Game extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L; // added default serial version (ID's our class)
	
	private String background = "/images/background.png";
	
	Timer loopTimer; // made a timer variable
	
	Player p; 
	Bullet b;

	public Game(){
		setFocusable(true); // focuses window
		
		loopTimer = new Timer(10, this); // every 10 milliseconds, "this" [class] will run
		loopTimer.start(); 
		
		p = new Player(0, 0); // Game.java:19
		b = new Bullet(200,200);
		
		addKeyListener(new KeyInput(p)); 
		
	}

	public void paint(Graphics g) {
		super.paint(g); // super means the Main class
		
		Graphics2D g2d = (Graphics2D) g; // g2d now has methods that can draw onto the board
		
		g2d.drawImage(getBackgroundImage(),0,0,this);
		
		p.draw(g2d); 
		b.draw(g2d);
	}
	
	public Image getBackgroundImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(background));
		return i.getImage();
	}

	@Override
	public void actionPerformed(ActionEvent e) { // contains anything you want to happen 
		p.update(); 
		b.update();
		
		repaint(); // built-in function that calls public void paint class 
	} 
}
