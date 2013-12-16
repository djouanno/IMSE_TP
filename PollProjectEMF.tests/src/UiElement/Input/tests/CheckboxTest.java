/**
 */
package UiElement.Input.tests;

import UiElement.Input.Checkbox;
import UiElement.Input.InputFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Checkbox</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckboxTest extends TestCase {

	/**
	 * The fixture for this Checkbox test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Checkbox fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CheckboxTest.class);
	}

	/**
	 * Constructs a new Checkbox test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckboxTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Checkbox test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Checkbox fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Checkbox test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Checkbox getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InputFactory.eINSTANCE.createCheckbox());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CheckboxTest
