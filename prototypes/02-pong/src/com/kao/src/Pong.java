package com.kao.src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Pong implements ActionListener, KeyListener {
	
	public static Pong pong = new Pong();
	
	public int width = 700, height = 700;
	
	public Renderer renderer; 
	
	public Paddle p1, p2;
	
	public Ball ball;
	
	public boolean bot = false;
	
	public boolean w, s, up, down;
	
	public int gameStatus = 0; // 0 = stopped, 1 = paused, 2 = playing 
	
	/* Constructor provides initial values for class fields when you create the object */
	public Pong(){
		/* The timer object tells ActionListener to fire an ActionEvent at the specified interval of 20 milliseconds */
		Timer timer = new Timer(20, this);
		JFrame jframe = new JFrame("Pong");
		
		renderer = new Renderer();
		
		jframe.pack(); // used to reposition window
		jframe.setVisible(true);
		jframe.setSize(width, height);
		jframe.setResizable(false);
		jframe.setLocationRelativeTo(null); // window opens in the middle
		
		jframe.add(renderer);
		jframe.addKeyListener(this);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // window opens in the middle
		
		start();
		
		timer.start();
	}
	
	public void start(){
		p1 = new Paddle(this, 1);
		p2 = new Paddle(this, 2);
		ball = new Ball(this);
	}
	
	public void update(){
		if (w) {
			p1.move(true);
		}
		if (s){
			p1.move(false);
		}
		if (up){
			p2.move(true);
		}
		if (down){
			p2.move(false);
		}
	}
	
	public void render(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);
		// g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (gameStatus == 0) {
			g.setColor(Color.WHITE);
			g.setFont(new Font(null, 1, 28));
			g.drawString("PONG", width / 2 - 22,height / 2 - 18);
			
			g.setFont(new Font(null, 1, 12));
			g.drawString("Press Space for singleplayer.", width / 2 - 40,height / 2 + 10);
			
			g.setFont(new Font(null, 1, 12));
			g.drawString("Press Shift for multiplayer.", width / 2 - 50,height / 2 + 30);
		}
		if (gameStatus == 1 || gameStatus == 2) {
			g.setColor(Color.WHITE);
			// g.setStroke(new BasicStroke(5f));
			g.drawLine(width / 2, 0, width / 2, height);
			
			p1.render(g);
			p2.render(g);
			ball.render(g);
		}
		if (gameStatus == 1) {
			g.setColor(Color.WHITE);
			g.setFont(new Font(null, 1, 24));
			g.drawString("PAUSED", width / 2 - 40,height / 2 - 10);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (gameStatus == 2) {
			update();			
		}
		
		renderer.repaint(); // repaint: in a frame, all components must be repainted
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int id = e.getKeyCode();
		
		if (id == KeyEvent.VK_W){
			w = true;
		}
		if (id == KeyEvent.VK_S){
			s = true;
		}
		if (id == KeyEvent.VK_UP){
			up = true;
		}
		if (id == KeyEvent.VK_DOWN){
			down = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int id = e.getKeyCode();
		
		if (id == KeyEvent.VK_W){
			w = false;
		}
		if (id == KeyEvent.VK_S){
			s = false;
		}
		if (id == KeyEvent.VK_UP){
			up = false;
		}
		if (id == KeyEvent.VK_DOWN){
			down = false;
		}
		
	}
	
}