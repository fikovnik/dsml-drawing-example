package drawing.java2d;


public interface Pen {

	/** Turn the turtle clockwise by {@code degrees} degrees. */
	public void turn(double degrees);

	/** Advance the pen the current direction by {@code steps} steps. */
	public void forward(double steps);

}