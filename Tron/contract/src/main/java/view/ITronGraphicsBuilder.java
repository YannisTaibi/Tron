package view;

import java.awt.Graphics;

interface ITronGraphicsBuilder {
	void clearGraphics(final Graphics graphics);
	void applyModelToGraphics(final Graphics graphics);

}
