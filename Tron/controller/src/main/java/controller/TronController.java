package controller;

import model.Direction;
import model.IGrid;
import model.ILightcycle;
import view.IView;

class TronController {
    private static int    TIME_SLEEP = 50;
    private final IGrid   model;
    private IView         view;
    private final boolean isGameOver = false;

    public TronController(final IGrid model) {
        this.model = model;
    }

    public void orderPerform(final IUserOrder userOrder) {
        if (userOrder != null) {
            final ILightcycle lightcycle = this.model.getMobileByPlayer(userOrder.getPlayer());
            if (lightcycle != null) {
                int direction;
                switch (userOrder.getOrder()) {
                case RIGHT:
                    direction = (Direction.RIGHT.ordinal() + 1) % 4;
                    break;
                case LEFT:
                    direction = (Direction.LEFT.ordinal() - 1) % 4;
                    break;
                case NOTHING:
                default:
                    direction = this.model.getMobileByPlayer(userOrder.getPlayer()).getDirection();
                    break;

                }
                lightcycle.setDirection(direction);
            }
        }
    }

    public void checkCollision() {

    }

    public void play() {
        this.gameLoop();
        this.view.displayMessage("Game Over !");
        this.view.closeAll();
    }

    private void gameLoop() {
        while (!this.isGameOver) {
            try {
                Thread.sleep(TronController.TIME_SLEEP);
            } catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
