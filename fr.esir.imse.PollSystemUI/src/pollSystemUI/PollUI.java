/**
 */
package pollSystemUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pollSystemUI.PollUI#getId <em>Id</em>}</li>
 *   <li>{@link pollSystemUI.PollUI#getQuestionsUI <em>Questions UI</em>}</li>
 * </ul>
 * </p>
 *
 * @see pollSystemUI.PollSystemUIPackage#getPollUI()
 * @model
 * @generated
 */
public interface PollUI extends EObject {
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
	 * @see pollSystemUI.PollSystemUIPackage#getPollUI_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pollSystemUI.PollUI#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Questions UI</b></em>' containment reference list.
	 * The list contents are of type {@link pollSystemUI.QuestionUI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions UI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions UI</em>' containment reference list.
	 * @see pollSystemUI.PollSystemUIPackage#getPollUI_QuestionsUI()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionUI> getQuestionsUI();

} // PollUI
