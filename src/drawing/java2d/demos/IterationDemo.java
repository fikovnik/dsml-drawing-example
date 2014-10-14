package drawing.java2d.demos;

import drawing.java2d.Pen;
import drawing.java2d.Sheet;
import drawing.java2d.swing.SwingPen;
import drawing.java2d.swing.SwingSheet;

public class IterationDemo implements Demo {

	private final int side;

	public IterationDemo(int side) {
		this.side = side;
	}

	@Override
	public void run(Sheet s, Pen p) {
		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 4; i++) {
				p.forward(side);
				p.turn(-90);
			}
			p.turn(36);
		}
	}

	public static void main(String args[]) {
		SwingSheet s = new SwingSheet(300, 300);
		Pen p = new SwingPen(s);

		new IterationDemo(100).run(s, p);

	}

}
