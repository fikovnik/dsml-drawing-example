/**
 */
package model.drawing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.drawing.DrawingFactory
 * @model kind="package"
 * @generated
 */
public interface DrawingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "drawing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mycompany.fr/drawing/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "drawing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DrawingPackage eINSTANCE = model.drawing.impl.DrawingPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.drawing.impl.DrawingScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.drawing.impl.DrawingScriptImpl
	 * @see model.drawing.impl.DrawingPackageImpl#getDrawingScript()
	 * @generated
	 */
	int DRAWING_SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_SCRIPT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_SCRIPT__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_SCRIPT__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_SCRIPT__COMMANDS = 3;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_SCRIPT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.drawing.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.drawing.impl.CommandImpl
	 * @see model.drawing.impl.DrawingPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.drawing.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.drawing.impl.ForwardImpl
	 * @see model.drawing.impl.DrawingPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__STEPS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.drawing.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.drawing.impl.TurnImpl
	 * @see model.drawing.impl.DrawingPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 3;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__DEGREES = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link model.drawing.impl.PenUpImpl <em>Pen Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.drawing.impl.PenUpImpl
	 * @see model.drawing.impl.DrawingPackageImpl#getPenUp()
	 * @generated
	 */
	int PEN_UP = 4;

	/**
	 * The number of structural features of the '<em>Pen Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_UP_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pen Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_UP_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.drawing.impl.PenDownImpl <em>Pen Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.drawing.impl.PenDownImpl
	 * @see model.drawing.impl.DrawingPackageImpl#getPenDown()
	 * @generated
	 */
	int PEN_DOWN = 5;

	/**
	 * The number of structural features of the '<em>Pen Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_DOWN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pen Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_DOWN_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link model.drawing.DrawingScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see model.drawing.DrawingScript
	 * @generated
	 */
	EClass getDrawingScript();

	/**
	 * Returns the meta object for the attribute '{@link model.drawing.DrawingScript#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.drawing.DrawingScript#getName()
	 * @see #getDrawingScript()
	 * @generated
	 */
	EAttribute getDrawingScript_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.drawing.DrawingScript#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see model.drawing.DrawingScript#getWidth()
	 * @see #getDrawingScript()
	 * @generated
	 */
	EAttribute getDrawingScript_Width();

	/**
	 * Returns the meta object for the attribute '{@link model.drawing.DrawingScript#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see model.drawing.DrawingScript#getHeight()
	 * @see #getDrawingScript()
	 * @generated
	 */
	EAttribute getDrawingScript_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link model.drawing.DrawingScript#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see model.drawing.DrawingScript#getCommands()
	 * @see #getDrawingScript()
	 * @generated
	 */
	EReference getDrawingScript_Commands();

	/**
	 * Returns the meta object for class '{@link model.drawing.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see model.drawing.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link model.drawing.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see model.drawing.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the attribute '{@link model.drawing.Forward#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steps</em>'.
	 * @see model.drawing.Forward#getSteps()
	 * @see #getForward()
	 * @generated
	 */
	EAttribute getForward_Steps();

	/**
	 * Returns the meta object for class '{@link model.drawing.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see model.drawing.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for the attribute '{@link model.drawing.Turn#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees</em>'.
	 * @see model.drawing.Turn#getDegrees()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Degrees();

	/**
	 * Returns the meta object for class '{@link model.drawing.PenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Up</em>'.
	 * @see model.drawing.PenUp
	 * @generated
	 */
	EClass getPenUp();

	/**
	 * Returns the meta object for class '{@link model.drawing.PenDown <em>Pen Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Down</em>'.
	 * @see model.drawing.PenDown
	 * @generated
	 */
	EClass getPenDown();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DrawingFactory getDrawingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.drawing.impl.DrawingScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.drawing.impl.DrawingScriptImpl
		 * @see model.drawing.impl.DrawingPackageImpl#getDrawingScript()
		 * @generated
		 */
		EClass DRAWING_SCRIPT = eINSTANCE.getDrawingScript();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRAWING_SCRIPT__NAME = eINSTANCE.getDrawingScript_Name();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRAWING_SCRIPT__WIDTH = eINSTANCE.getDrawingScript_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRAWING_SCRIPT__HEIGHT = eINSTANCE.getDrawingScript_Height();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_SCRIPT__COMMANDS = eINSTANCE.getDrawingScript_Commands();

		/**
		 * The meta object literal for the '{@link model.drawing.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.drawing.impl.CommandImpl
		 * @see model.drawing.impl.DrawingPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link model.drawing.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.drawing.impl.ForwardImpl
		 * @see model.drawing.impl.DrawingPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORWARD__STEPS = eINSTANCE.getForward_Steps();

		/**
		 * The meta object literal for the '{@link model.drawing.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.drawing.impl.TurnImpl
		 * @see model.drawing.impl.DrawingPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '<em><b>Degrees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__DEGREES = eINSTANCE.getTurn_Degrees();

		/**
		 * The meta object literal for the '{@link model.drawing.impl.PenUpImpl <em>Pen Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.drawing.impl.PenUpImpl
		 * @see model.drawing.impl.DrawingPackageImpl#getPenUp()
		 * @generated
		 */
		EClass PEN_UP = eINSTANCE.getPenUp();

		/**
		 * The meta object literal for the '{@link model.drawing.impl.PenDownImpl <em>Pen Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.drawing.impl.PenDownImpl
		 * @see model.drawing.impl.DrawingPackageImpl#getPenDown()
		 * @generated
		 */
		EClass PEN_DOWN = eINSTANCE.getPenDown();

	}

} //DrawingPackage
