package model;

import java.awt.Color;

public class Lightcycle implements ILightcycle {

    private final Grid     grid;
    private Boolean        alive;
    private final Color    color;
    private final Position position;
    private int            direction;

    public Lightcycle(final Grid grid, final Position position, final Color color) {
        this.grid = grid;
        this.alive = true;
        this.color = color;
        this.position = position;

    }

    @Override
    public boolean isAlive() {
        return this.alive;
    }

    @Override
    public void die() {
        this.alive = false;
    }

    @Override
    public Grid getGrid() {
        return this.grid;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public void MoveUp() {
        this.position.setY(this.position.getY() + 1);
    }

    public void MoveDown() {
        this.position.setY(this.position.getY() - 1);
    }

    public void MoveRight() {
        this.position.setX(this.position.getX() + 1);
    }

    public void MoveLeft() {
        this.position.setX(this.position.getX() - 1);
    }

    @Override
    public int getDirection() {
        return this.direction;
    }

    @Override
    public void setDirection(final int direction) {
        // TODO Auto-generated method stub

    }

}
