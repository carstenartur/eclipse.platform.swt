package org.eclipse.swt.examples.paint;

/*
 * (c) Copyright IBM Corp. 2000, 2001.
 * All Rights Reserved
 */

import org.eclipse.swt.graphics.*;

/**
 * 2D Ellipse object
 */
public class MetaEllipse extends MetaStatelessXORHelper {
	private Color color;
	private int x1, y1, x2, y2;
	/**
	 * Constructs a <code>Meta.Ellipse</code>
	 * These objects are defined by any two diametrically opposing corners of a 
	 * 
	 * @param color the color for this object
	 * @param x1 the virtual X coordinate of the first point
	 * @param y1 the virtual Y coordinate of the first point
	 * @param x2 the virtual X coordinate of the second point
	 * @param y2 the virtual Y coordinate of the second point
	 */
	public MetaEllipse(Color color, int x1, int y1, int x2, int y2) {
		this.color = color; this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
	}
	public void draw(GC gc, Point offset) {
		gc.setForeground(color);
		gcDraw(gc, offset);
	}
	protected void gcDraw(GC gc, Point offset) {
		gc.drawOval(Math.min(x1, x2) + offset.x, Math.min(y1, y2) + offset.y,
			Math.abs(x2 - x1) + 1, Math.abs(y2 - y1) + 1);
	}			
}
