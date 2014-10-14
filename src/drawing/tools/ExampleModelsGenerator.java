package drawing.tools;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import model.drawing.DrawingFactory;
import model.drawing.DrawingPackage;
import model.drawing.DrawingScript;
import model.drawing.Forward;
import model.drawing.PenDown;
import model.drawing.PenUp;
import model.drawing.Turn;
import drawing.java2d.Pen;
import drawing.java2d.Sheet;
import drawing.java2d.demos.Demo;
import drawing.java2d.demos.IterationDemo;
import drawing.java2d.demos.SnowflakesDemo;
import drawing.java2d.demos.SpirangleDemo;
import drawing.java2d.demos.StarDemo;
import drawing.java2d.demos.TriangleDemo;
import drawing.utils.ModelUtils;

public class ExampleModelsGenerator implements Tool {

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

		@Override
		public void penDown() {
			PenDown cmd = factory.createPenDown();
			script.getCommands().add(cmd);
		}

		@Override
		public void penUp() {
			PenUp cmd = factory.createPenUp();
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
			new StarDemo(100), new IterationDemo(100), new SpirangleDemo(), new SnowflakesDemo() };

	private static final int SHEET_WIDTH = 800;
	private static final int SHEET_HEIGH = 600;

	public void generate(File outputDir) throws IOException {

		if (!outputDir.exists())
			outputDir.mkdirs();

		for (Demo demo : demos) {
			String name = demo.getClass().getSimpleName();
			File dest = new File(outputDir, String.format("%s.%s", name, "xmi"));

			Sheet s = new DummySheet(SHEET_HEIGH, SHEET_WIDTH);
			ModelSynthesizer p = new ModelSynthesizer(s);

			demo.run(s, p);

			DrawingScript script = p.getScript();
			script.setName(name);

			ModelUtils.save(script, dest);
			System.out.println("Generated: " + dest.getAbsolutePath());
		}
	}

	@Override
	public void run(String[] args) throws Exception {
		if (args.length != 1) {
			throw new RuntimeException("Usage: " + getClass().getSimpleName()
					+ " <output directory>");
		}

		new ExampleModelsGenerator().generate(new File(args[0]));
	}

}
