package view;

import javax.swing.JFrame;

class EasyFrame extends JFrame {
	private static final long	serialVersionUID	= -1112124206501543946L;
	public static final int		ZOOM				= 7;

	public EasyFrame(final String title, final Grid grid) {

		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

		final EasyPanel easyPanel = new EasyPanel(new TronGraphicsBuilder(grid));
		this.setContentPane(easyPanel);
		this.setSize((grid.getWidth() * ZOOM) + this.getInsets().left + this.getInsets().right,
				(grid.getHeight() * ZOOM) + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//grid.addObserver(easyPanel);
	}
}
