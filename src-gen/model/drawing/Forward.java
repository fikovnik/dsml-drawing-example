/**
 */
package model.drawing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.drawing.Forward#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.drawing.DrawingPackage#getForward()
 * @model
 * @generated
 */
public interface Forward extends Command {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' attribute.
	 * @see #setSteps(int)
	 * @see model.drawing.DrawingPackage#getForward_Steps()
	 * @model required="true"
	 * @generated
	 */
	int getSteps();

	/**
	 * Sets the value of the '{@link model.drawing.Forward#getSteps <em>Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps</em>' attribute.
	 * @see #getSteps()
	 * @generated
	 */
	void setSteps(int value);

} // Forward
