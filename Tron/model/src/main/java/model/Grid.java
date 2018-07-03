package model;

import java.util.Observable;

public class Grid extends Observable implements IGrid {
    public int              width;
    public int              height;
    private IMotionLess[][] matrix;

    public Grid(final int width, final int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    @Override
    public IMotionLess getMatrixXY(final int x, final int y) {
        return this.matrix[x][y];
    }

    @Override
    public void setMatrixXY(final IMotionLess motionLess, final int x, final int y) {
        this.matrix[x][y] = motionLess;
    }

}
