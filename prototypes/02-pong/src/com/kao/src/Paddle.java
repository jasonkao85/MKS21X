package com.kao.src;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	
	public int paddleNum;
	
	public int x, y, width = 30, height = 170, distanceFromBorder = 20;
	
	public int score;

	public Paddle(Pong pong, int paddleNum) {
		this.paddleNum = paddleNum;
		
		if (paddleNum == 1){
			this.x = 0 + distanceFromBorder;
		}
		if (paddleNum == 2){
			this.x = pong.width - width - distanceFromBorder;
		}
		this.y = pong.height / 2 - this.height / 2;
	}

	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);	
	}

	public void move(boolean up) {
		int speed = 3;
		
		if (up){
			if (y - speed > 0){
				y -= speed;
			} else {
				y = 0;
			}
		} else {
			if (y + height + speed < Pong.pong.height - 22){
				y += speed;
			} else{
				y = Pong.pong.height - height - 22;
			}
		}
		
	}

}
