/**
 */
package pollSystemUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pollSystemUI.QuestionUI#getId <em>Id</em>}</li>
 *   <li>{@link pollSystemUI.QuestionUI#getType <em>Type</em>}</li>
 *   <li>{@link pollSystemUI.QuestionUI#getOptionsUI <em>Options UI</em>}</li>
 * </ul>
 * </p>
 *
 * @see pollSystemUI.PollSystemUIPackage#getQuestionUI()
 * @model
 * @generated
 */
public interface QuestionUI extends EObject {
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
	 * @see pollSystemUI.PollSystemUIPackage#getQuestionUI_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pollSystemUI.QuestionUI#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pollSystemUI.TYPE_QUESTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pollSystemUI.TYPE_QUESTION
	 * @see #setType(TYPE_QUESTION)
	 * @see pollSystemUI.PollSystemUIPackage#getQuestionUI_Type()
	 * @model
	 * @generated
	 */
	TYPE_QUESTION getType();

	/**
	 * Sets the value of the '{@link pollSystemUI.QuestionUI#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pollSystemUI.TYPE_QUESTION
	 * @see #getType()
	 * @generated
	 */
	void setType(TYPE_QUESTION value);

	/**
	 * Returns the value of the '<em><b>Options UI</b></em>' containment reference list.
	 * The list contents are of type {@link pollSystemUI.OptionUI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options UI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options UI</em>' containment reference list.
	 * @see pollSystemUI.PollSystemUIPackage#getQuestionUI_OptionsUI()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionUI> getOptionsUI();

} // QuestionUI
