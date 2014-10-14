package drawing.tools;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		
		if (args.length < 1) {
			System.err.println("Missing tool name");
			System.exit(1);
		}
		
		String toolName = args[0];
		String[] toolArgs = Arrays.copyOfRange(args, 1, args.length); 
		
		Class<?> toolClazz = Class.forName("drawing.tools."+toolName);
		Tool tool = Tool.class.cast(toolClazz.newInstance());
		tool.run(toolArgs);
	}
	
}
