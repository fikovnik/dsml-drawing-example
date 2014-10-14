package drawing.java2d.demos;

import drawing.java2d.Pen;
import drawing.java2d.Sheet;
import drawing.java2d.swing.SwingPen;
import drawing.java2d.swing.SwingSheet;

public class SnowflakesDemo implements Demo {

	private void f(int length, int depth, Pen p) {
		if (depth == 0) {
			p.forward(length);
		} else {
			f(length / 3, depth - 1, p);
			p.turn(60);
			f(length / 3, depth - 1, p);
			p.turn(-120);
			f(length / 3, depth - 1, p);
			p.turn(60);
			f(length / 3, depth - 1, p);
		}
	}

	@Override
	public void run(Sheet s, Pen p) {
		int size = s.getWidth() / 4;

		p.penUp();
		p.forward(-s.getWidth() / 2);
		p.penDown();

		for (int i = 0; i < 3; i++) {
			f(size, 4, p);

			p.penUp();
			p.forward(size / 2);
			p.penDown();
		}
	}

	public static void main(String args[]) {
		SwingSheet s = new SwingSheet(800, 600);
		Pen p = new SwingPen(s);

		new SnowflakesDemo().run(s, p);

	}

}
