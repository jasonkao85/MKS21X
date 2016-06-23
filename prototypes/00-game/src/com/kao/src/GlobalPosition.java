package com.kao.src;

public class GlobalPosition {

	public int x;
	public int y; // public so it can be accessed in other classes
	
	public GlobalPosition(int x, int y) {
		this.x = x; // this.x, this.y are the variables up there
		this.y = y; // x, y are the parameters
	}
}
