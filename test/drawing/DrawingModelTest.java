package drawing;

import static org.junit.Assert.*;
import model.drawing.DrawingPackage;
import model.drawing.Turn;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

public class DrawingModelTest {

	@Test
	public void testTurnWithinARange() {
		Turn turn = DrawingPackage.eINSTANCE.getDrawingFactory().createTurn();
		turn.setDegrees(200);
		
		Diagnostic res = Diagnostician.INSTANCE.validate(turn);
		assertEquals(Diagnostic.ERROR, res.getSeverity());
	}

}
