/**
 */
package pollSystemUI;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pollSystemUI.PollSystemUIPackage
 * @generated
 */
public interface PollSystemUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PollSystemUIFactory eINSTANCE = pollSystemUI.impl.PollSystemUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Poll System UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll System UI</em>'.
	 * @generated
	 */
	PollSystemUI createPollSystemUI();

	/**
	 * Returns a new object of class '<em>Poll UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll UI</em>'.
	 * @generated
	 */
	PollUI createPollUI();

	/**
	 * Returns a new object of class '<em>Question UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question UI</em>'.
	 * @generated
	 */
	QuestionUI createQuestionUI();

	/**
	 * Returns a new object of class '<em>Option UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option UI</em>'.
	 * @generated
	 */
	OptionUI createOptionUI();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PollSystemUIPackage getPollSystemUIPackage();

} //PollSystemUIFactory
