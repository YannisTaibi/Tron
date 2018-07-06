/*
 *
 */
package view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import model.IGrid;
import model.ILightcycle;

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
     * @param grid
     *            the grid
     */
    public TronGraphicsBuilder(final IGrid grid) {
        this.grid = grid;
    }

    /**
     * Clear graphics.
     *
     * @param graphics
     *            the graphics
     */

    /**
     * Apply model to graphic.
     *
     * @param graphics
     *            the graphics
     */

    public void drawAllLightCycle(final Graphics graphics) {
        for (final ILightcycle lightCycle : this.grid.getLightcycle()) {
            this.drawLightCycle(graphics, lightCycle);
        }
    }

    public void drawBorderWall(final Graphics graphics) {

    }

    public void drawLightCycle(final Graphics graphics, final ILightcycle lightCycle) {
        graphics.setColor(lightCycle.getColor());
        graphics.fillRect(lightCycle.getPosition().getX() * EasyFrame.ZOOM,
                lightCycle.getPosition().getY() * EasyFrame.ZOOM, EasyFrame.ZOOM, EasyFrame.ZOOM);
    }

    public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer) {
        this.drawAllLightCycle(graphics);
    }
}