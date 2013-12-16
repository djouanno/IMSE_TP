/**
 */
package pollSystemUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pollSystemUI.OptionUI#getId <em>Id</em>}</li>
 *   <li>{@link pollSystemUI.OptionUI#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see pollSystemUI.PollSystemUIPackage#getOptionUI()
 * @model
 * @generated
 */
public interface OptionUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pollSystemUI.PollSystemUIPackage#getOptionUI_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pollSystemUI.OptionUI#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pollSystemUI.TYPE_OPTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pollSystemUI.TYPE_OPTION
	 * @see #setType(TYPE_OPTION)
	 * @see pollSystemUI.PollSystemUIPackage#getOptionUI_Type()
	 * @model
	 * @generated
	 */
	TYPE_OPTION getType();

	/**
	 * Sets the value of the '{@link pollSystemUI.OptionUI#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pollSystemUI.TYPE_OPTION
	 * @see #getType()
	 * @generated
	 */
	void setType(TYPE_OPTION value);

} // OptionUI
