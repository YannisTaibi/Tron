package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.Grid;
import model.IGrid;
import model.ILightcycle;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {
    private final static IGrid       grid;
    private final static ILightcycle lightcicle;
    private final static int         width  = 400;
    private final static int         height = 600;

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
        final Grid grid = new Grid(Main.width, Main.height);

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}
