/*
 *
 */
package model;

// TODO: Auto-generated Javadoc
/**
 * The Class Position.
 */
public class Position implements IPosition {

    /** The x. */
    private int x;

    /** The y. */
    private int y;

    /**
     * Instantiates a new position.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public Position(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Instantiates a new position.
     *
     * @param position
     *            the position
     */
    public Position(final Position position) {
        this(position.getX(), position.getY());
    }

    /**
     * Gets the x.
     *
     * @return the x
     */
    @Override
    public int getX() {
        return this.x;
    }

    /**
     * Sets the x.
     *
     * @param x
     *            the new x
     */
    @Override
    public void setX(final int x) {
        this.x = x;
    }

    /**
     * Gets the y.
     *
     * @return the y
     */
    @Override
    public int getY() {
        return this.y;
    }

    /**
     * Sets the y.
     *
     * @param y
     *            the new y
     */
    @Override
    public void setY(final int y) {
        this.y = y;
    }
}
