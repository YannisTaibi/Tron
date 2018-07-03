package controller;

import java.awt.Color;
import model.IGrid;
import view.IEasyFrame;
import model.ILightcycle;
import model.IModel;
import view.IView;

class TronController {
    static private int    width      = 400;
    static private int    height     = 600;
    private static int    TIME_SLEEP = 50;
    private final IModel  model;
    private IView         view;
    private final boolean isGameOver = false;

    public TronController() {
        this.model = this.model;
    }

    public void orderPerform(final IUserOrder userOrder) {
		if (userOrder != null) {
			final ILightcycle lightcycle = this.
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
