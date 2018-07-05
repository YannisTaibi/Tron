/*
 *
 */
package view;

import model.IMotionLess;

// TODO: Auto-generated Javadoc
/**
 * The Enum ElementGrid.
 */
public enum ElementGrid implements IMotionLess {

    /** The wall. */
    WALL,
    /** The wall1. */
    WALL1,
    /** The wall2. */
    WALL2,
    /** The ground. */
    GROUND;

    /**
     * Gets the element grid by player.
     *
     * @param player
     *            the player
     * @return the element grid by player
     */
    public static ElementGrid getElementGridByPlayer(final int player) {
        if (player == 1) {
            return ElementGrid.WALL1;
        } else {
            return ElementGrid.WALL2;
        }
    }
}
