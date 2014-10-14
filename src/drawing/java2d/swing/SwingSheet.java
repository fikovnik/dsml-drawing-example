package drawing.java2d.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JFrame;

import drawing.java2d.Sheet;

/** 
 * Sheet that can draw lines and instances of {@code Drawable}.
 * 
 * This class is not thread-safe.
 */
@SuppressWarnings("serial")
public class SwingSheet extends JComponent implements Sheet {

	/** The image and associated graphic in which the pens draw. */
	private final Image offscreen;

	/** The off-screen graphics for drawing. */
	private Graphics2D ofg2;
	
	private final Collection<SwingPen> pens = new LinkedList<SwingPen>();

	private int width;
	private int height;


	public SwingSheet() {
		this(800, 600);
	}
	
	public SwingSheet(int width, int height) {
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));

		offscreen = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		ofg2 = (Graphics2D) offscreen.getGraphics();
		ofg2.setColor(Color.WHITE);
		ofg2.fillRect(0, 0, width, height);
		ofg2.translate(width / 2, height / 2);
		ofg2.scale(1, -1);

		JFrame f = new JFrame("Sheet");
		f.setContentPane(this);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		
		// center
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - width) / 2);
	    int y = (int) ((dimension.getHeight() - height) / 2);
	    f.setLocation(x, y);
	    
		f.pack();
		f.setVisible(true);
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.drawImage(offscreen, 0, 0, this);

		g2.translate(width / 2, height / 2);
		g2.scale(1, -1);

		for (SwingPen t : pens) {
			AffineTransform trans = g2.getTransform();
			t.drawPen(g2);
			g2.setTransform(trans);
		}
	}

	@Override
	public void drawLine(double ax, double ay, double bx, double by,
			Color color) {
		ofg2.setColor(color);
		ofg2.draw(new Line2D.Double(ax, ay, bx, by));
	}

	/** Adds a {@code StandardPen} to the sheet */
	public void add(SwingPen d) {
		pens.add(d);
	}
}
