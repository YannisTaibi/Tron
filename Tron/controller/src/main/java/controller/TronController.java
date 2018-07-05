/*
 *
 */
package controller;

import java.util.ArrayList;

import model.Direction;
import model.IGrid;
import model.ILightcycle;
import view.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class TronController.
 */
public class TronController implements IController, IOrderPerformer {

    /** The time sleep. */
    private static int    TIME_SLEEP = 50;

    /** The grid. */
    private final IGrid   grid;

    /** The view. */
    private IView         view;

    /** The is game over. */
    private final boolean isGameOver = false;

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
                    direction = (Direction.RIGHT.ordinal() + 1) % 4;
                    System.out.println("JE DAB");
                    break;
                case LEFT:
                    direction = (Direction.LEFT.ordinal() - 1) % 4;
                    System.out.println("TRIPLE DAB");
                    break;
                case NOTHING:
                default:
                    direction = this.grid.getLightcycleByPlayer(userOrder.getPlayer()).getDirection();
                    break;

                }
                lightcycle.setDirection(direction);
            }
        }
    }

    /**
     * Check collision.
     */
    @Override
    public void checkCollision() {

    }

    /**
     * Play.
     */
    @Override
    public void play() {
        this.gameLoop();
        this.view.displayMessage("Game Over !");
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
            final ArrayList<ILightcycle> initialLightcycles = new ArrayList<ILightcycle>();
            for (final ILightcycle lightcycle : this.grid.getLightcycle()) {
                initialLightcycles.add(lightcycle);
                this.grid.createWall(0);
                this.grid.createWall(1);
            }
            for (final ILightcycle lightcycle : initialLightcycles) {
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
