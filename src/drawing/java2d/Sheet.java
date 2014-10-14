package drawing.java2d;

import java.awt.Color;

public interface Sheet {

	public void drawLine(double ax, double ay, double bx, double by, Color color);

	public int getHeight();

	public int getWidth();

}