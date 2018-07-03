package view;

import java.util.Observable;

import javax.swing.JFrame;

import model.IGrid;

class EasyFrame extends JFrame implements IEasyFrame {
    private static final long serialVersionUID = -1112124206501543946L;
    public static final int   ZOOM             = 7;
    private Observable        observable;

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

    public Observable getObservable() {
        return this.observable;
    }

    public void setObservable(final Observable observable) {
        this.observable = observable;
    }
}
