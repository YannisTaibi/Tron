/*
 *
 */
package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

import model.IGrid;

// TODO: Auto-generated Javadoc
/**
 * The Class EasyFrame.
 */
class EasyFrame extends JFrame implements IEasyFrame, KeyListener {

    /** The Constant serialVersionUID. */
    private static final long     serialVersionUID = -1112124206501543946L;

    /** The Constant ZOOM. */
    public static final int       ZOOM             = 1;

    /** The observable. */
    private Observable            observable;

    private final IEventPerformer eventPerformer;

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
        this.eventPerformer = eventPerformer;

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

    @Override
    public void keyPressed(final KeyEvent keyEvent) {
        this.eventPerformer.eventPerform(keyEvent);

    }

    @Override
    public void keyReleased(final KeyEvent keyEvent) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(final KeyEvent keyEvent) {
        // TODO Auto-generated method stub

    }
}
