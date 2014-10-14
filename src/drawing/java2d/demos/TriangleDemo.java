package drawing.java2d.demos;

import drawing.java2d.Pen;
import drawing.java2d.Sheet;
import drawing.java2d.swing.SwingPen;
import drawing.java2d.swing.SwingSheet;

public class TriangleDemo implements Demo {

	private final int side;

	public TriangleDemo(int side) {
		this.side = side;
	}

	@Override
	public void run(Sheet s, Pen p) {
        p.forward(side);
        p.turn(120);
        p.forward(side);
        p.turn(120);
        p.forward(side);
	}
	
	public static void main(String args[]) {
		SwingSheet s = new SwingSheet(300, 300);
		Pen p = new SwingPen(s);
		
		new TriangleDemo(100).run(s, p);
		
	}

}
