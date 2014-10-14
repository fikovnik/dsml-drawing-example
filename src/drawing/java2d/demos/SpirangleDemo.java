package drawing.java2d.demos;

import drawing.java2d.Pen;
import drawing.java2d.Sheet;
import drawing.java2d.swing.SwingPen;
import drawing.java2d.swing.SwingSheet;

/**
 * 
 * based on {@linkplain http://en.wikipedia.org/wiki/Turtle_graphics#mediaviewer/File:Turtle-Graphics_Polyspiral.svg}
 *
 */
public class SpirangleDemo implements Demo {

	@Override
	public void run(Sheet s, Pen p) {
		double dist = .01;
		double angle = 89.5;
		double inc = 0.01;
		int segs = 184;
				
		for (int i=0; i<segs; i++) {
			p.forward(dist * .6 * s.getWidth());
			p.turn(-angle);
			dist += inc;
		}
		
	}

	public static void main(String args[]) {
		SwingSheet s = new SwingSheet(300, 300);
		Pen p = new SwingPen(s);

		new SpirangleDemo().run(s, p);

	}

}
