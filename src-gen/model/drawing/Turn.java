/**
 */
package model.drawing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.drawing.Turn#getDegrees <em>Degrees</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.drawing.DrawingPackage#getTurn()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DegreesWithingRange'"
 * @generated
 */
public interface Turn extends Command {
	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' attribute.
	 * @see #setDegrees(int)
	 * @see model.drawing.DrawingPackage#getTurn_Degrees()
	 * @model required="true"
	 * @generated
	 */
	int getDegrees();

	/**
	 * Sets the value of the '{@link model.drawing.Turn#getDegrees <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' attribute.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(int value);

} // Turn
