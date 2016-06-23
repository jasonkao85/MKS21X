package com.kao.src;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String args[]) {
		
		JFrame frame = new JFrame();
		frame.pack(); // used to reposition window
		frame.setSize(640,640);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // window opens in the middle
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // enables X button
		frame.add(new Game());
		frame.setVisible(true);

	}

}
