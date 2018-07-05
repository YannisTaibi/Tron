/*
 *
 */
package view;

import java.util.Observable;

import javax.swing.JFrame;

import model.IGrid;

// TODO: Auto-generated Javadoc
/**
 * The Class EasyFrame.
 */
class EasyFrame extends JFrame implements IEasyFrame {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1112124206501543946L;

    /** The Constant ZOOM. */
    public static final int   ZOOM             = 7;

    /** The observable. */
    private Observable        observable;

    /**
     * Instantiates a new easy frame.
     *
     * @param title
     *            the title
     * @param eventPerformer
     *            the event performer
     * @param tronGraphicsBuilder
     *            the tron graphics builder
     * @param grid
     *            the grid
     * @param observable
     *            the observable
     */
    public EasyFrame(final String title, final EventPerformer eventPerformer,
            final TronGraphicsBuilder tronGraphicsBuilder, final IGrid grid, final Observable observable) {

        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setObservable(observable);

        final EasyPanel easyPanel = new EasyPanel(new TronGraphicsBuilder(grid));
        this.setContentPane(easyPanel);
        this.setSize((grid.getWidth() * EasyFrame.ZOOM) + this.getInsets().left + this.getInsets().right,
                (grid.getHeight() * EasyFrame.ZOOM) + this.getInsets().top + this.getInsets().bottom);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.getObservable().addObserver(easyPanel);
    }

    /**
     * Gets the observable.
     *
     * @return the observable
     */
    public Observable getObservable() {
        return this.observable;
    }

    /**
     * Sets the observable.
     *
     * @param observable
     *            the new observable
     */
    public void setObservable(final Observable observable) {
        this.observable = observable;
    }
}
