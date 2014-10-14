package drawing.tools;

import model.drawing.Command;
import model.drawing.DrawingScript;
import model.drawing.Forward;
import model.drawing.Turn;

public class JSCompiler extends AbstractModelLoadingTool implements Compiler {

	private static final String endl = System.getProperty("line.separator");

	@Override
	public String compile(DrawingScript script) {

		StringBuilder sb = new StringBuilder();
		sb.append("<html>"
				+ endl
				+ "<body>"
				+ endl
				+ "<div id='logo_div'></div>"
				+ endl
				+ "<script src='./canvas_turtle.packed.js' type='text/javascript'></script>"
				+ endl
				+ "<script>"
				+ endl
				+ String.format("var p = new canvas_turtle('logo_div', { width: %d, height: %d });", script.getWidth(), script.getHeight())
				+ endl);

		sb.append(endl);

		for (Command cmd : script.getCommands()) {
			if (cmd instanceof Forward) {
				Forward fwd = (Forward) cmd;
				sb.append(String.format("p.draw(%d)", fwd.getSteps()) + endl);
			} else if (cmd instanceof Turn) {
				Turn turn = (Turn) cmd;
				if (turn.getDegrees() > 0) {
					sb.append(String.format("p.right(%d)", turn.getDegrees())
							+ endl);
				} else {
					sb.append(String.format("p.left(%d)", -turn.getDegrees())
							+ endl);
				}
			} else {
				throw new RuntimeException("Unknown command " + cmd);
			}
		}

		sb.append(endl);
		sb.append("</script>" + endl + "</body>" + endl + "</html>");

		return sb.toString();
	}

	@Override
	protected void doRun(DrawingScript script) throws Exception {
		JSCompiler compiler = new JSCompiler();
		String code = compiler.compile(script);
		System.out.println(code);		
	}

}
