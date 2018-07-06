/*
 *
 */
package controller;

import model.IGrid;
import model.ILightcycle;
import view.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class TronController.
 */
public class TronController implements IController, IOrderPerformer {

    /** The time sleep. */
    private static int  TIME_SLEEP = 30;

    /** The grid. */
    private final IGrid grid;

    /** The view. */
    private IView       view;

    /** The is game over. */
    private boolean     isGameOver = false;

    /**
     * Instantiates a new tron controller.
     *
     * @param grid
     *            the grid
     */
    public TronController(final IGrid grid) {
        this.grid = grid;
    }

    /**
     * Order perform.
     *
     * @param userOrder
     *            the user order
     */
    @Override
    public void orderPerform(final IUserOrder userOrder) {
        if (userOrder != null) {
            final ILightcycle lightcycle = this.grid.getLightcycleByPlayer(userOrder.getPlayer());
            if (lightcycle != null) {
                int direction;
                switch (userOrder.getOrder()) {
                case RIGHT:
                    direction = (lightcycle.setDirection(
                            (this.grid.getLightcycleByPlayer(userOrder.getPlayer()).getDirection() + 1 + 4) % 4));
                    System.out.println("JE VAIS A DROITE");

                    break;
                case LEFT:
                    direction = (lightcycle.setDirection(
                            ((this.grid.getLightcycleByPlayer(userOrder.getPlayer()).getDirection() - 1) + 4) % 4));
                    System.out.println("JE VAIS A GAUCHE");
                    break;
                case NOTHING:
                default:
                    direction = lightcycle
                            .setDirection(this.grid.getLightcycleByPlayer(userOrder.getPlayer()).getDirection());
                    break;

                }

                System.out.println(direction);
                lightcycle.setDirection(direction);
            }
        }
    }

    /**
     * Check collision.
     */
    @Override
    public void checkCollision() {
        for (int player = 0; player < 2; player++) {
            if (this.grid.getMatrixXY(this.grid.getLightcycleByPlayer(player).getPosition().getX(),
                    this.grid.getLightcycleByPlayer(player).getPosition().getY()).isWALL()) {
                this.isGameOver = true;
                this.grid.getLightcycleByPlayer(player).die();
            }
        }
    }

    /**
     * Play.
     */
    @Override
    public void play() {
        this.gameLoop();
        if (!this.grid.getLightcycleByPlayer(0).isAlive() && !this.grid.getLightcycleByPlayer(1).isAlive()) {
            this.view.displayMessage("Its a tie");
        } else if (!this.grid.getLightcycleByPlayer(0).isAlive()) {
            this.view.displayMessage("Player 2 wins");
        } else if (!this.grid.getLightcycleByPlayer(1).isAlive()) {
            this.view.displayMessage("Player 1 wins");
        }
        this.view.closeAll();
    }

    /**
     * Game loop.
     */
    @Override
    public void gameLoop() {
        while (!this.isGameOver) {
            try {
                Thread.sleep(TronController.TIME_SLEEP);
            } catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            this.checkCollision();
            this.grid.createWall(0);
            this.grid.createWall(1);
            for (final ILightcycle lightcycle : this.grid.getLightcycle()) {
                lightcycle.move();
            }
            this.grid.setLightcyclesHaveMoved();
        }
    }

    @Override
    public void setView(final IView view) {
        this.view = view;
    }
}
