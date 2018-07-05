/*
 * 
 */
package view;

import java.awt.Graphics;

// TODO: Auto-generated Javadoc
/**
 * The Interface ITronGraphicsBuilder.
 */
interface ITronGraphicsBuilder {
	
	/**
	 * Clear graphics.
	 *
	 * @param graphics the graphics
	 */
	void clearGraphics(final Graphics graphics);
	
	/**
	 * Apply model to graphics.
	 *
	 * @param graphics the graphics
	 */
	void applyModelToGraphics(final Graphics graphics);

}
