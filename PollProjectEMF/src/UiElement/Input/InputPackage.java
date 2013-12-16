/**
 */
package UiElement.Input;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see UiElement.Input.InputFactory
 * @model kind="package"
 * @generated
 */
public interface InputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Input";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "imse.input";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imse.input";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputPackage eINSTANCE = UiElement.Input.impl.InputPackageImpl.init();

	/**
	 * The meta object id for the '{@link UiElement.Input.Input <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UiElement.Input.Input
	 * @see UiElement.Input.impl.InputPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = 1;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UiElement.Input.impl.CheckboxImpl <em>Checkbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UiElement.Input.impl.CheckboxImpl
	 * @see UiElement.Input.impl.InputPackageImpl#getCheckbox()
	 * @generated
	 */
	int CHECKBOX = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__TEXT = INPUT__TEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__ID = INPUT__ID;

	/**
	 * The number of structural features of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UiElement.Input.impl.RadioImpl <em>Radio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UiElement.Input.impl.RadioImpl
	 * @see UiElement.Input.impl.InputPackageImpl#getRadio()
	 * @generated
	 */
	int RADIO = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO__TEXT = INPUT__TEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO__ID = INPUT__ID;

	/**
	 * The number of structural features of the '<em>Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UiElement.Input.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UiElement.Input.impl.ButtonImpl
	 * @see UiElement.Input.impl.InputPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = INPUT__TEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = INPUT__ID;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link UiElement.Input.impl.DropdownImpl <em>Dropdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UiElement.Input.impl.DropdownImpl
	 * @see UiElement.Input.impl.InputPackageImpl#getDropdown()
	 * @generated
	 */
	int DROPDOWN = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__TEXT = INPUT__TEXT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN__ID = INPUT__ID;

	/**
	 * The number of structural features of the '<em>Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link UiElement.Input.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see UiElement.Input.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link UiElement.Input.Input#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see UiElement.Input.Input#getText()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Text();

	/**
	 * Returns the meta object for the attribute '{@link UiElement.Input.Input#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see UiElement.Input.Input#getId()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Id();

	/**
	 * Returns the meta object for class '{@link UiElement.Input.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox</em>'.
	 * @see UiElement.Input.Checkbox
	 * @generated
	 */
	EClass getCheckbox();

	/**
	 * Returns the meta object for class '{@link UiElement.Input.Radio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio</em>'.
	 * @see UiElement.Input.Radio
	 * @generated
	 */
	EClass getRadio();

	/**
	 * Returns the meta object for class '{@link UiElement.Input.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see UiElement.Input.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link UiElement.Input.Dropdown <em>Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown</em>'.
	 * @see UiElement.Input.Dropdown
	 * @generated
	 */
	EClass getDropdown();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InputFactory getInputFactory();

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
		 * The meta object literal for the '{@link UiElement.Input.Input <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UiElement.Input.Input
		 * @see UiElement.Input.impl.InputPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TEXT = eINSTANCE.getInput_Text();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__ID = eINSTANCE.getInput_Id();

		/**
		 * The meta object literal for the '{@link UiElement.Input.impl.CheckboxImpl <em>Checkbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UiElement.Input.impl.CheckboxImpl
		 * @see UiElement.Input.impl.InputPackageImpl#getCheckbox()
		 * @generated
		 */
		EClass CHECKBOX = eINSTANCE.getCheckbox();

		/**
		 * The meta object literal for the '{@link UiElement.Input.impl.RadioImpl <em>Radio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UiElement.Input.impl.RadioImpl
		 * @see UiElement.Input.impl.InputPackageImpl#getRadio()
		 * @generated
		 */
		EClass RADIO = eINSTANCE.getRadio();

		/**
		 * The meta object literal for the '{@link UiElement.Input.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UiElement.Input.impl.ButtonImpl
		 * @see UiElement.Input.impl.InputPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link UiElement.Input.impl.DropdownImpl <em>Dropdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UiElement.Input.impl.DropdownImpl
		 * @see UiElement.Input.impl.InputPackageImpl#getDropdown()
		 * @generated
		 */
		EClass DROPDOWN = eINSTANCE.getDropdown();

	}

} //InputPackage
