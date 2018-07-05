/*
 *
 */
package main;

import java.awt.Color;

import controller.TronController;
import model.Grid;
import model.Lightcycle;
import model.Position;
import view.TronView;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {
    private final static int width  = 400;
    private final static int height = 600;

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final Grid grid = new Grid(Main.width, Main.height);
        grid.addLightcycle(new Lightcycle(new Position(50, 50), 1, Color.CYAN, 0));
        grid.addLightcycle(new Lightcycle(new Position(550, 550), 3, Color.YELLOW, 1));
        final TronController controller = new TronController(grid);
        controller.setView(new TronView(controller, grid, grid));
        controller.play();
    }

}
