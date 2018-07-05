/*
 * 
 */
package view;

import java.awt.Graphics;

import model.IGrid;

// TODO: Auto-generated Javadoc
/**
 * The Class TronGraphicsBuilder.
 */
public class TronGraphicsBuilder {
    
    /** The grid. */
    private final IGrid grid;

    /**
     * Instantiates a new tron graphics builder.
     *
     * @param grid the grid
     */
    public TronGraphicsBuilder(final IGrid grid) {
        this.grid = grid;
    }

    /**
     * Clear graphics.
     *
     * @param graphics the graphics
     */
    private void clearGraphics(final Graphics graphics) {
        graphics.clearRect(0, 0, this.grid.getWidth() * EasyFrame.ZOOM, this.grid.getHeight() * EasyFrame.ZOOM);
    }

    /**
     * Apply model to graphic.
     *
     * @param graphics the graphics
     */
    public void applyModelToGraphic(final Graphics graphics) {
        this.clearGraphics(graphics);
    }
}