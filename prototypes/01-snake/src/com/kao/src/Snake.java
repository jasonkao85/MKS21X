package com.kao.src;

import javax.swing.JFrame;

public class Snake {

	public static Snake snake;
	// constructor
	public Snake() {
		JFrame frame = new JFrame();
		frame.pack(); // used to reposition window
		frame.setSize(800,600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // window opens in the middle
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // enables X button
		frame.setVisible(true);
	}
	
	public static void main(String args[]){
		snake = new Snake();
	}
}
