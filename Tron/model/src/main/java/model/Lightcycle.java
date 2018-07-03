package model;

import java.awt.Color;



public class Lightcycle {
	
	private final Grid grid;
	private Boolean 	alive;
	private final Color color;
	
	
	public Lightcycle(final Grid grid, final int width, final int height, final Color color) {
		this.grid = grid;
		this.alive = true;
		this.color = color;
	}
	
	
	public boolean isAlive() {
		return this.alive;
	}
	
	public void die() {
		this.alive = false;
	}
	
	public Grid getGrid() {
		return this.grid;
	}
	
	public Color getColor() {
		return this.color;
	}
}
