package drawing.java2d.demos;

import drawing.java2d.Pen;
import drawing.java2d.Sheet;
import drawing.java2d.swing.SwingPen;
import drawing.java2d.swing.SwingSheet;

public class StarDemo implements Demo {

	private final int side;

	public StarDemo(int side) {
		this.side = side;
	}

	@Override
	public void run(Sheet s, Pen p) {
		for (int n = 1; n < 50; n++) {
			p.forward(side);
			p.turn(110);
		}
	}

	public static void main(String args[]) {
		SwingSheet s = new SwingSheet(300, 300);
		Pen p = new SwingPen(s);

		new StarDemo(100).run(s, p);

	}

}
