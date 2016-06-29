package com.kao.src;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Renderer extends JPanel {

	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g); 
		
		Cow.cow.render((Graphics2D) g);
	}

}
