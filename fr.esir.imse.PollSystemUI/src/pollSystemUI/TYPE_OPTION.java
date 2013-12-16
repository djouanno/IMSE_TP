/**
 */
package pollSystemUI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TYPE OPTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pollSystemUI.PollSystemUIPackage#getTYPE_OPTION()
 * @model
 * @generated
 */
public enum TYPE_OPTION implements Enumerator {
	/**
	 * The '<em><b>CHECKBOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX(0, "CHECKBOX", "CHECKBOX"),

	/**
	 * The '<em><b>LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(1, "LABEL", "LABEL"),

	/**
	 * The '<em><b>RADIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO(2, "RADIO", "RADIO"),

	/**
	 * The '<em><b>DROPDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DROPDOWN(3, "DROPDOWN", "DROPDOWN");

	/**
	 * The '<em><b>CHECKBOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHECKBOX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_VALUE = 0;

	/**
	 * The '<em><b>LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 1;

	/**
	 * The '<em><b>RADIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RADIO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_VALUE = 2;

	/**
	 * The '<em><b>DROPDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DROPDOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DROPDOWN_VALUE = 3;

	/**
	 * An array of all the '<em><b>TYPE OPTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TYPE_OPTION[] VALUES_ARRAY =
		new TYPE_OPTION[] {
			CHECKBOX,
			LABEL,
			RADIO,
			DROPDOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>TYPE OPTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TYPE_OPTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TYPE OPTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TYPE_OPTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TYPE_OPTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TYPE OPTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TYPE_OPTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TYPE_OPTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TYPE OPTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TYPE_OPTION get(int value) {
		switch (value) {
			case CHECKBOX_VALUE: return CHECKBOX;
			case LABEL_VALUE: return LABEL;
			case RADIO_VALUE: return RADIO;
			case DROPDOWN_VALUE: return DROPDOWN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TYPE_OPTION(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TYPE_OPTION
