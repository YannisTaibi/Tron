package view;

import java.awt.Graphics;

import model.IGrid;

public class TronGraphicsBuilder {
    private final IGrid grid;

    public TronGraphicsBuilder(final IGrid grid) {
        this.grid = grid;
    }

    private void clearGraphics(final Graphics graphics) {
        graphics.clearRect(0, 0, this.grid.getWidth() * EasyFrame.ZOOM, this.grid.getHeight() * EasyFrame.ZOOM);
    }

    public void applyModelToGraphic(final Graphics graphics) {
        this.clearGraphics(graphics);
    }
}