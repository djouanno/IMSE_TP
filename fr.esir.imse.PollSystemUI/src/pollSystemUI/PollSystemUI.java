/**
 */
package pollSystemUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll System UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pollSystemUI.PollSystemUI#getPollsUI <em>Polls UI</em>}</li>
 * </ul>
 * </p>
 *
 * @see pollSystemUI.PollSystemUIPackage#getPollSystemUI()
 * @model
 * @generated
 */
public interface PollSystemUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Polls UI</b></em>' containment reference list.
	 * The list contents are of type {@link pollSystemUI.PollUI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polls UI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polls UI</em>' containment reference list.
	 * @see pollSystemUI.PollSystemUIPackage#getPollSystemUI_PollsUI()
	 * @model containment="true"
	 * @generated
	 */
	EList<PollUI> getPollsUI();

} // PollSystemUI
