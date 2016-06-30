package com.kao.src;

import java.awt.Color;
import java.awt.Graphics;
import com.kao.src.Fighter;

public class Milk {
	
	public int x, y, width = 10, height = 10;
	
	public Double velX, velY;
	
	private final double milkDirection;
	
	public Milk(Fighter fighter) {
		this.x = fighter.x;
		this.y = fighter.y;
		
		milkDirection = fighter.angle;
	}
	
	public void move() {
		velX = new Double(Math.cos(milkDirection) * 10);
		int motionX = (int) (velX.intValue() * Fighter.speedMilk);
		velY = new Double(Math.sin(milkDirection) * 10); 
		int motionY = (int) (velY.intValue() * Fighter.speedMilk);
		x += motionX;
		y += motionY;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}

}
