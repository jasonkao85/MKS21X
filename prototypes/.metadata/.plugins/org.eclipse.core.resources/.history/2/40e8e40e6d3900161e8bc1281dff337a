package com.kao.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import com.kao.src.GlobalPosition;

public class Player extends GlobalPosition {

	private String playerimage= "/images/player.png"; // path to images folder
			
	public Player(int x, int y) { // Auto-generated player constructor 
		super(x, y); // feeds the code in public class GlobalPosition 
	}
	
	public void update(){
		
	}
	
	public void draw(Graphics2D g2d){ // g2d is the graphics variable we draw on
		g2d.drawImage(getPlayerImage(), x, y, null); // observer null means it's not referring to this class
	}
	
	public Image getPlayerImage(){ // returns image
		ImageIcon i = new ImageIcon(getClass().getResource(playerimage)); // gets image
		return i.getImage(); 
	}

	
}
