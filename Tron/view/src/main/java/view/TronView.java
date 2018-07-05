/*
 *
 */
package view;

import java.io.IOException;
import java.util.Observable;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import model.IGrid;

// TODO: Auto-generated Javadoc
/**
 * The Class TronView.
 */
public class TronView implements IView, Runnable {

    /** The tron graphics builder. */
    private final TronGraphicsBuilder tronGraphicsBuilder;

    /** The event performer. */
    private final EventPerformer      eventPerformer;

    /** The observable. */
    private final Observable          observable;

    /** The grid. */
    private IGrid                     grid;

    /** The easy frame. */
    private EasyFrame                 easyFrame;

    /**
     * Instantiates a new tron view.
     *
     * @param orderPerformer
     *            the order performer
     * @param grid
     *            the grid
     * @param observable
     *            the observable
     */
    public TronView(final IOrderPerformer orderPerformer, final IGrid grid, final Observable observable) {
        this.observable = observable;
        this.tronGraphicsBuilder = new TronGraphicsBuilder(grid);
        this.eventPerformer = new EventPerformer(orderPerformer);
        this.grid = grid;
        SwingUtilities.invokeLater(this);

    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        this.easyFrame = new EasyFrame("Tron", this.eventPerformer, this.tronGraphicsBuilder, null, this.observable);

    }

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    @Override
    public void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * Close all.
     */
    @Override
    public void closeAll() {
        this.easyFrame.dispose();
    }

    /**
     * Gets the grid.
     *
     * @return the grid
     */
    public IGrid getGrid() {
        return this.grid;
    }

    /**
     * Sets the grid.
     *
     * @param grid
     *            the new grid
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public void setGrid(final IGrid grid) throws IOException {
        this.grid = grid;
        for (int x = 0; x < this.getGrid().getWidth(); x++) {
            for (int y = 0; y < this.getGrid().getHeight(); y++) {
                if ((x == 0) || (x == 399) || (y == 0) || (y == 599)) {
                    this.getGrid().setMatrixXY(ElementGrid.WALL, x, y);
                }
                this.getGrid().setMatrixXY(ElementGrid.GROUND, x, y);
            }
        }
    }

}
