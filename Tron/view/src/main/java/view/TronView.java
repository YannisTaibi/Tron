package view;

import java.util.Observable;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import model.IGrid;

class TronView implements Runnable {
	private final TronGraphicsBuilder tronGraphicsBuilder;
	private final EventPerformer eventPerformer;
	private final Observable observable;
	private EasyFrame easyFrame;
	
	public TronView(final IOrderPerformer orderPerformer, final IGrid grid, final Observable observable) {
		this.observable = observable;
		this.tronGraphicsBuilder = new TronGraphicsBuilder(grid);
		this.eventPerformer = new EventPerformer(orderPerformer);
		SwingUtilities.invokeLater(this);
		
	}

	@Override
	public void run() {
		this.easyFrame = new EasyFrame("Tron", this.eventPerformer, this.tronGraphicsBuilder, null, this.observable);
		
	}
	
	public void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void closeAll() {
		this.easyFrame.dispose();
	}

}
