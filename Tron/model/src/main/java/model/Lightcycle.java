/*
 *
 */
package model;

import java.awt.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class Lightcycle.
 */
public class Lightcycle implements ILightcycle {

    /** The alive. */
    private Boolean     alive;

    /** The color. */
    private final Color color;

    /** The position. */
    private IPosition   position;

    /** The direction. */
    private final int   direction;

    /** The player. */
    private final int   player;

    private IGrid       grid;

    /**
     * Instantiates a new lightcycle.
     *
     * @param position
     *            the position
     * @param direction
     *            the direction
     * @param color
     *            the color
     * @param player
     *            the player
     */
    public Lightcycle(final IPosition position, final int direction, final Color color, final int player) {
        this.direction = direction;
        this.alive = true;
        this.color = color;
        this.position = position;
        this.player = player;

    }

    /*
     * (non-Javadoc)
     *
     * @see model.ILightcycle#isAlive()
     */
    @Override
    public boolean isAlive() {
        return this.alive;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.ILightcycle#die()
     */
    @Override
    public void die() {
        System.out.println("BOUM");
        this.alive = false;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.ILightcycle#getColor()
     */
    @Override
    public Color getColor() {
        return this.color;
    }

    /**
     * Move up.
     */
    private void MoveUp() {
        this.position.setY(this.position.getY() + 1);
    }

    /**
     * Move down.
     */
    private void MoveDown() {
        this.position.setY(this.position.getY() - 1);
    }

    /**
     * Move right.
     */
    private void MoveRight() {
        this.position.setX(this.position.getX() + 1);
    }

    /**
     * Move left.
     */
    private void MoveLeft() {
        this.position.setX(this.position.getX() - 1);
    }

    /*
     * (non-Javadoc)
     *
     * @see model.ILightcycle#getDirection()
     */
    @Override
    public int getDirection() {
        return this.direction;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.ILightcycle#setDirection(int)
     */
    @Override
    public void setDirection(final int direction) {
        // TODO Auto-generated method stub
    }

    /**
     * Move.
     */
    @Override
    public void move() {
        switch (this.direction) {
        case 0:
            this.MoveUp();
            break;
        case 1:
            this.MoveRight();
            break;

        case 2:
            this.MoveDown();
            break;

        case 3:
            this.MoveLeft();
            break;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see model.ILightcycle#getPosition()
     */
    @Override
    public IPosition getPosition() {
        return this.position;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.ILightcycle#setPosition(model.IPosition)
     */
    @Override
    public void setPosition(final IPosition position) {
        this.position = position;
    }

    /**
     * Checks if is player.
     *
     * @param player
     *            the player
     * @return true, if is player
     */
    @Override
    public boolean isPlayer(final int player) {
        return this.player == player;
    }

    @Override
    public IGrid getGrid() {
        return this.grid;
    }

    @Override
    public void setGrid(final IGrid grid) {
        this.grid = grid;
    }
}
