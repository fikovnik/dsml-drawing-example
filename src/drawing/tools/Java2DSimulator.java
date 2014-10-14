package drawing.tools;

import model.drawing.Command;
import model.drawing.DrawingScript;
import model.drawing.Forward;
import model.drawing.Turn;
import drawing.java2d.swing.SwingPen;
import drawing.java2d.swing.SwingSheet;

public class Java2DSimulator extends AbstractModelLoadingTool implements Simulator {

	@Override
	public void simulate(DrawingScript script) {
		
		// create the window - sheet
		SwingSheet sheet = new SwingSheet(script.getWidth(), script.getHeight());
		SwingPen pen = new SwingPen(sheet);
		
		// for each command in the script I need to move / trun the pen
		for(Command cmd : script.getCommands()) {
			
			if (cmd instanceof Forward) {
				pen.forward(((Forward)cmd).getSteps());
			} else if (cmd instanceof Turn){
				pen.turn(((Turn)cmd).getDegrees());
			} else {
				throw new RuntimeException("Unknown command "+cmd);
			}
			
		}
		
	}

	@Override
	protected void doRun(DrawingScript script) throws Exception {
		// create the simulator
		Java2DSimulator simulator = new Java2DSimulator();
		// simulate
		simulator.simulate(script);
	}
	
}
