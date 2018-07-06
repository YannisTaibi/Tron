/*
 *
 */
package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class EasyPanel.
 */
class EasyPanel extends JPanel implements Observer {

    /** The Constant serialVersionUID. */
    private static final long         serialVersionUID = 3987064896591403626L;

    /** The graphics builder. */
    private final TronGraphicsBuilder graphicsBuilder;

    /**
     * Instantiates a new easy panel.
     *
     * @param graphicsBuilder
     *            the graphics builder
     */
    public EasyPanel(final TronGraphicsBuilder graphicsBuilder) {
        this.graphicsBuilder = graphicsBuilder;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    @Override
    public void update(final Observable arg0, final Object arg1) {
        this.repaint();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
     */
    @Override
    protected void paintComponent(final Graphics graphics) {
        this.graphicsBuilder.applyModelToGraphic(graphics, this);
    }
}
