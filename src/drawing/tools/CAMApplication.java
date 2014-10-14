package drawing.tools;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class CAMApplication extends JFrame implements Tool {

	private enum Action {
		RECTANGLE, DELETE;
	}

	private class ShapesView extends JComponent {
		final MouseListener DELETING_LISTENER = new DeletingListener();

		final RectangleDrawingListener RECTANGLE_DRAWING_LISTENER = new RectangleDrawingListener();

		private final class DeletingListener extends MouseAdapter {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int i=shapes.size()-1; i>=0; i--) {
					Shape s = shapes.get(i);
					if (s.contains(e.getPoint())) {
						shapes.remove(i);
						repaint();
						break;
					}
				}
			}
		}
		
		private final class RectangleDrawingListener extends MouseAdapter {
			public void mousePressed(MouseEvent e) {
				endDrag = startDrag = e.getPoint();

				repaint();
			}

			public void mouseReleased(MouseEvent e) {
				Point p = e.getPoint();

				if (p.x < 0)
					p.x = 0;
				if (p.y < 0)
					p.y = 0;
				if (p.x > getWidth())
					p.x = getWidth();
				if (p.y > getHeight())
					p.y = getHeight();

				Shape r = makeRectangle(startDrag, p);
				ShapesView.this.shapes.add(r);

				startDrag = endDrag = null;

				repaint();
			}
		}

		private final List<Shape> shapes;

		private Point startDrag, endDrag;

		private Color[] colors = new Color[] { Color.YELLOW, Color.MAGENTA,
				Color.CYAN, Color.RED, Color.BLUE, Color.PINK };

		public ShapesView(List<Shape> shapes) {
			this.shapes = shapes;

			this.addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					endDrag = e.getPoint();
					repaint();
				}
			});

			setAction(Action.RECTANGLE);
		}

		public void setAction(Action action) {
			for (MouseListener l : this.getMouseListeners()) {
				this.removeMouseListener(l);
			}
			
			switch (action) {
			case RECTANGLE:
				this.addMouseListener(RECTANGLE_DRAWING_LISTENER);
				break;
			case DELETE:
				this.addMouseListener(DELETING_LISTENER);
				break;
			default:
				break;
			}
		}

		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);

			// paint background
			g2.setPaint(Color.WHITE);
			g2.fillRect(0, 0, this.getWidth(), this.getHeight());

			int colorIndex = 0;

			g2.setStroke(new BasicStroke(1));
			g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
					0.50f));

			for (Shape s : shapes) {
				g2.setPaint(Color.BLACK);
				g2.draw(s);
				g2.setPaint(colors[(colorIndex++) % 6]);
				g2.fill(s);
			}

			if (startDrag != null && endDrag != null) {
				g2.setPaint(Color.LIGHT_GRAY);
				Shape r = makeRectangle(startDrag, endDrag);
				g2.draw(r);
			}
		}

		private Rectangle2D.Float makeRectangle(Point p1, Point p2) {
			return new Rectangle2D.Float(Math.min(p1.x, p2.x), Math.min(p1.y,
					p2.y), Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));
		}
	}

	private final List<Shape> shapes = new ArrayList<Shape>();

	public CAMApplication() {
		this.setTitle("CAM");
		this.setPreferredSize(new Dimension(800, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		final ShapesView shapesView = new ShapesView(shapes);
		this.add(shapesView, BorderLayout.CENTER);

		JPanel controls = new JPanel();
		this.add(controls, BorderLayout.NORTH);

		JButton btnClear = new JButton("Clear");
		controls.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				shapes.clear();
				shapesView.repaint();
			}
		});

		JButton btnSave = new JButton("Save");
		controls.add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doSave();
			}
		});
		// TODO remove once the save action is implemented
		btnSave.setEnabled(false);

		JButton btnSimulate = new JButton("Simulate");
		controls.add(btnSimulate);
		btnSimulate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doSimulate();
			}
		});
		// TODO remove once the save action is implemented
		btnSimulate.setEnabled(false);

		ButtonGroup actions = new ButtonGroup();

		JToggleButton btnRectangle = new JToggleButton("Rectangle");
		controls.add(btnRectangle);
		actions.add(btnRectangle);
		btnRectangle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				shapesView.setAction(Action.RECTANGLE);
			}
		});
		btnRectangle.setSelected(true);
		shapesView.setAction(Action.RECTANGLE);

		JToggleButton btnDelete = new JToggleButton("Delete");
		controls.add(btnDelete);
		actions.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				shapesView.setAction(Action.DELETE);
			}
		});


		this.pack();
		this.setVisible(true);
	}

	protected void doSimulate() {
		// TODO implement

	}

	protected void doSave() {
		// TODO implement

	}

	@Override
	public void run(String[] args) throws Exception {
		new CAMApplication();
	}

}