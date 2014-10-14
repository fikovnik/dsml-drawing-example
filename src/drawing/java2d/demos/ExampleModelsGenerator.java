package drawing.java2d.demos;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import model.drawing.DrawingFactory;
import model.drawing.DrawingPackage;
import model.drawing.DrawingScript;
import model.drawing.Forward;
import model.drawing.Turn;
import drawing.java2d.Pen;
import drawing.java2d.Sheet;
import drawing.utils.ModelUtils;

public class ExampleModelsGenerator {

	class ModelSynthesizer implements Pen {

		private final DrawingFactory factory = DrawingPackage.eINSTANCE
				.getDrawingFactory();
		private final DrawingScript script = factory.createDrawingScript();

		public ModelSynthesizer(Sheet sheet) {
			script.setHeight(sheet.getHeight());
			script.setWidth(sheet.getWidth());
		}

		@Override
		public void turn(double degrees) {
			Turn cmd = factory.createTurn();
			cmd.setDegrees((int) degrees);
			script.getCommands().add(cmd);
		}

		@Override
		public void forward(double steps) {
			Forward cmd = factory.createForward();
			cmd.setSteps((int) steps);
			script.getCommands().add(cmd);
		}

		public DrawingScript getScript() {
			return script;
		}

	}

	class DummySheet implements Sheet {

		private int height;
		private int width;

		public DummySheet(int height, int width) {
			this.height = height;
			this.width = width;
		}

		@Override
		public void drawLine(double ax, double ay, double bx, double by,
				Color color) {
		}

		@Override
		public int getHeight() {
			return height;
		}

		@Override
		public int getWidth() {
			return width;
		}

	}

	private final Demo[] demos = new Demo[] { new TriangleDemo(100),
			new StarDemo(100), new IterationDemo(100), new SpirangleDemo() };

	private final File parent = new File("examples/models");

	private static final int SHEET_WIDTH = 300;
	private static final int SHEET_HEIGH = 300;

	public void generate() throws IOException {
		
		if (!parent.exists()) parent.mkdirs();
		
		for (Demo demo : demos) {
			String name = demo.getClass().getSimpleName();
			File dest = new File(parent, String.format("%s.%s", name,
					"xmi"));

			Sheet s = new DummySheet(SHEET_HEIGH, SHEET_WIDTH);
			ModelSynthesizer p = new ModelSynthesizer(s);

			demo.run(s, p);

			DrawingScript script = p.getScript();
			script.setName(name);

			ModelUtils.save(script, dest);
			System.out.println("Generated: "+dest.getAbsolutePath());
		}
	}

	public static void main(String[] args) throws IOException {
		new ExampleModelsGenerator().generate();
	}

}
