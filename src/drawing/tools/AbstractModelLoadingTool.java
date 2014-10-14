package drawing.tools;

import java.io.File;

import model.drawing.DrawingScript;
import drawing.utils.ModelUtils;

public abstract class AbstractModelLoadingTool implements Tool {
	
	@Override
	public void run(String[] args) throws Exception {
		if (args.length != 1) {
			throw new RuntimeException("Usage: "+getClass().getSimpleName()+" <drawing model file>");
		}
		
		// load the file
		DrawingScript script = ModelUtils.load(new File(args[0]));
		doRun(script);
	}

	protected abstract void doRun(DrawingScript script) throws Exception; 
	
}
