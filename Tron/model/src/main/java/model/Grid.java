package model;

import java.util.Observable;

public class Grid extends Observable implements IGrid{
	public int												width;
	public int												height;
	
	public Grid(final int width, final int height) {
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	

	
	
}
