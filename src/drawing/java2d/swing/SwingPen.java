package drawing.java2d.swing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

import drawing.java2d.Pen;

public class SwingPen implements Pen {
	/** Shape representing the pen. */
	private final Polygon penShape;

	private double x = 0;
	private double y = 0;
	private double direction = 0;

	private SwingSheet sheet = null;
	
	private boolean penDown = true;

	public SwingPen(SwingSheet sheet) {
		if (sheet == null) {
			throw new IllegalArgumentException("A sheet cannot be null");
		}

		this.penShape = new Polygon(new int[] { 0, 0, 10 }, new int[] { 3, -3, 0 }, 3);
		this.sheet = sheet;
		
		sheet.add(this);
	}

	@Override
	public void turn(double degrees) {
		direction += Math.toRadians(degrees);

		sheet.repaint();
	}

	@Override
	public void forward(double steps) {
		double nx = x + steps * Math.cos(direction);
		double ny = y + steps * Math.sin(direction);

		if (penDown) {
			sheet.drawLine(x, y, nx, ny, Color.BLACK);
		}
		
		x = nx;
		y = ny;

		sheet.repaint();
	}

	public void drawPen(Graphics2D g2) {
		g2.setColor(Color.BLACK);
		g2.translate(x, y);
		g2.rotate(direction);
		if (penDown) {			
			g2.fill(penShape);
		} else {			
			g2.draw(penShape);
		}
	}

	@Override
	public void penUp() {
		penDown = false;
		sheet.repaint();
	}

	@Override
	public void penDown() {
		penDown = true;
		sheet.repaint();
	}
}
