/*
 *
 */
package model;

import java.awt.Color;

// TODO: Auto-generated Javadoc
/**
 * The Interface ILightcycle.
 */
public interface ILightcycle {

    /**
     * Checks if is alive.
     *
     * @return true, if is alive
     */
    boolean isAlive();

    /**
     * Die.
     */
    void die();

    /**
     * Gets the color.
     *
     * @return the color
     */
    public Color getColor();

    /**
     * Gets the direction.
     *
     * @return the direction
     */
    int getDirection();

    /**
     * Sets the direction.
     *
     * @param direction
     *            the new direction
     */
    void setDirection(int direction);

    /**
     * Gets the position.
     *
     * @return the position
     */
    public IPosition getPosition();

    /**
     * Sets the position.
     *
     * @param position
     *            the new position
     */
    public void setPosition(IPosition position);

    public boolean isPlayer(final int player);

    IGrid getGrid();

    void setGrid(final IGrid grid);

    public void move();

}
