package model;

import java.awt.Color;


public interface ILightcycle {
	boolean isAlive();
	void die();
	public IGrid getGrid();
	public Color getColor();

}
