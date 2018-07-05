/*
 *
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import view.ElementGrid;

// TODO: Auto-generated Javadoc
/**
 * The Class Grid.
 */
public class Grid extends Observable implements IGrid {

    /** The width. */
    public int                           width;

    /** The height. */
    public int                           height;

    /** The matrix. */
    private IMotionLess[][]              matrix;

    /** The lightcycle. */
    private final ArrayList<ILightcycle> lightcycles;

    /**
     * Instantiates a new grid.
     *
     * @param width
     *            the width
     * @param height
     *            the height
     */
    public Grid(final int width, final int height) {
        this.width = width;
        this.height = height;
        this.lightcycles = new ArrayList<ILightcycle>();
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getHeight()
     */
    @Override
    public int getHeight() {
        return this.height;
    }

    /**
     * Sets the height.
     *
     * @param height
     *            the new height
     */
    public void setHeight(final int height) {
        this.height = height;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getWidth()
     */
    @Override
    public int getWidth() {
        return this.width;
    }

    /**
     * Sets the width.
     *
     * @param width
     *            the new width
     */
    public void setWidth(final int width) {
        this.width = width;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getMatrixXY(int, int)
     */
    @Override
    public IMotionLess getMatrixXY(final int x, final int y) {
        return this.matrix[x][y];
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#setMatrixXY(model.IMotionLess, int, int)
     */
    @Override
    public void setMatrixXY(final IMotionLess motionLess, final int x, final int y) {
        this.matrix[x][y] = motionLess;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getLightcycle()
     */
    @Override
    public ArrayList<ILightcycle> getLightcycle() {
        return this.lightcycles;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getExampleById(int)
     */
    @Override
    public Example getExampleById(final int id) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getAllExamples()
     */
    @Override
    public List<Example> getAllExamples() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getMobileByPlayer(int)
     */
    @Override
    public ILightcycle getLightcycleByPlayer(final int player) {
        for (final ILightcycle lightcycle : this.lightcycles) {
            if (lightcycle.isPlayer(player)) {

            }
        }
        return null;
    }

    /**
     * Creates the wall.
     *
     * @param player
     *            the player
     */
    @Override
    public void createWall(final int player) {
        this.setMatrixXY(ElementGrid.getElementGridByPlayer(player),
                this.getLightcycleByPlayer(player).getPosition().getX(),
                this.getLightcycleByPlayer(player).getPosition().getY());

    }

    @Override
    public void setLightcyclesHaveMoved() {
        this.setChanged();
        this.notifyObservers();
    }

    public void addLightcycle(final ILightcycle lightcycle) {
        this.lightcycles.add(lightcycle);
        lightcycle.setGrid(this);
    }

}
