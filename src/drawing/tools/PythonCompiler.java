package drawing.tools;

import model.drawing.Command;
import model.drawing.DrawingScript;
import model.drawing.Forward;
import model.drawing.Turn;

public class PythonCompiler extends AbstractModelLoadingTool implements Compiler {

	private static final String endl = System.getProperty("line.separator");

	@Override
	public String compile(DrawingScript script) {

		StringBuilder sb = new StringBuilder();
		sb.append("import turtle" + endl);
		sb.append(endl);
		sb.append(String.format("turtle.setup(%d,%d)", script.getWidth(), script.getHeight()) + endl);
		sb.append(endl);
		sb.append("p = turtle.Turtle()" + endl);
		sb.append(endl);

		// for each command in the script I need to move / trun the pen
		for (Command cmd : script.getCommands()) {

			if (cmd instanceof Forward) {
				Forward fwd = (Forward) cmd;
				sb.append(String.format("p.forward(%d)", fwd.getSteps()) + endl);
			} else if (cmd instanceof Turn) {
				Turn turn = (Turn) cmd;
				if (turn.getDegrees() > 0) {
					sb.append(String.format("p.right(%d)", turn.getDegrees()) + endl);
				} else {
					sb.append(String.format("p.left(%d)", -turn.getDegrees()) + endl);
				}
			} else {
				throw new RuntimeException("Unknown command " + cmd);
			}			
		}

		return sb.toString();
	}

	@Override
	protected void doRun(DrawingScript script) throws Exception {
		PythonCompiler compiler = new PythonCompiler();
		String code = compiler.compile(script);
		System.out.println(code);		
	}

}
