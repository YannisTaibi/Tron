/*
 *
 */
package controller;

import view.IView;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Interface IController.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {

    /**
     * Order perform.
     *
     * @param userOrder
     *            the user order
     */
    public void orderPerform(final IUserOrder userOrder);

    /**
     * Check collision.
     */
    public void checkCollision();

    /**
     * Play.
     */
    public void play();

    /**
     * Game loop.
     */
    public void gameLoop();

    public void setView(final IView view);

}
