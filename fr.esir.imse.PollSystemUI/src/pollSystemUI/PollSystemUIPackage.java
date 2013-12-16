/**
 */
package pollSystemUI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see pollSystemUI.PollSystemUIFactory
 * @model kind="package"
 * @generated
 */
public interface PollSystemUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pollSystemUI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.esir.fr/imse/PollSystemUI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pollSystemUI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PollSystemUIPackage eINSTANCE = pollSystemUI.impl.PollSystemUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link pollSystemUI.impl.PollSystemUIImpl <em>Poll System UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pollSystemUI.impl.PollSystemUIImpl
	 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getPollSystemUI()
	 * @generated
	 */
	int POLL_SYSTEM_UI = 0;

	/**
	 * The feature id for the '<em><b>Polls UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SYSTEM_UI__POLLS_UI = 0;

	/**
	 * The number of structural features of the '<em>Poll System UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SYSTEM_UI_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Poll System UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SYSTEM_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pollSystemUI.impl.PollUIImpl <em>Poll UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pollSystemUI.impl.PollUIImpl
	 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getPollUI()
	 * @generated
	 */
	int POLL_UI = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_UI__ID = 0;

	/**
	 * The feature id for the '<em><b>Questions UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_UI__QUESTIONS_UI = 1;

	/**
	 * The number of structural features of the '<em>Poll UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_UI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Poll UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pollSystemUI.impl.QuestionUIImpl <em>Question UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pollSystemUI.impl.QuestionUIImpl
	 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getQuestionUI()
	 * @generated
	 */
	int QUESTION_UI = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_UI__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_UI__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Options UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_UI__OPTIONS_UI = 2;

	/**
	 * The number of structural features of the '<em>Question UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_UI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Question UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pollSystemUI.impl.OptionUIImpl <em>Option UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pollSystemUI.impl.OptionUIImpl
	 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getOptionUI()
	 * @generated
	 */
	int OPTION_UI = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_UI__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_UI__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Option UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_UI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pollSystemUI.TYPE_QUESTION <em>TYPE QUESTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pollSystemUI.TYPE_QUESTION
	 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getTYPE_QUESTION()
	 * @generated
	 */
	int TYPE_QUESTION = 4;

	/**
	 * The meta object id for the '{@link pollSystemUI.TYPE_OPTION <em>TYPE OPTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pollSystemUI.TYPE_OPTION
	 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getTYPE_OPTION()
	 * @generated
	 */
	int TYPE_OPTION = 5;


	/**
	 * Returns the meta object for class '{@link pollSystemUI.PollSystemUI <em>Poll System UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll System UI</em>'.
	 * @see pollSystemUI.PollSystemUI
	 * @generated
	 */
	EClass getPollSystemUI();

	/**
	 * Returns the meta object for the containment reference list '{@link pollSystemUI.PollSystemUI#getPollsUI <em>Polls UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polls UI</em>'.
	 * @see pollSystemUI.PollSystemUI#getPollsUI()
	 * @see #getPollSystemUI()
	 * @generated
	 */
	EReference getPollSystemUI_PollsUI();

	/**
	 * Returns the meta object for class '{@link pollSystemUI.PollUI <em>Poll UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll UI</em>'.
	 * @see pollSystemUI.PollUI
	 * @generated
	 */
	EClass getPollUI();

	/**
	 * Returns the meta object for the attribute '{@link pollSystemUI.PollUI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pollSystemUI.PollUI#getId()
	 * @see #getPollUI()
	 * @generated
	 */
	EAttribute getPollUI_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link pollSystemUI.PollUI#getQuestionsUI <em>Questions UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions UI</em>'.
	 * @see pollSystemUI.PollUI#getQuestionsUI()
	 * @see #getPollUI()
	 * @generated
	 */
	EReference getPollUI_QuestionsUI();

	/**
	 * Returns the meta object for class '{@link pollSystemUI.QuestionUI <em>Question UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question UI</em>'.
	 * @see pollSystemUI.QuestionUI
	 * @generated
	 */
	EClass getQuestionUI();

	/**
	 * Returns the meta object for the attribute '{@link pollSystemUI.QuestionUI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pollSystemUI.QuestionUI#getId()
	 * @see #getQuestionUI()
	 * @generated
	 */
	EAttribute getQuestionUI_Id();

	/**
	 * Returns the meta object for the attribute '{@link pollSystemUI.QuestionUI#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pollSystemUI.QuestionUI#getType()
	 * @see #getQuestionUI()
	 * @generated
	 */
	EAttribute getQuestionUI_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link pollSystemUI.QuestionUI#getOptionsUI <em>Options UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options UI</em>'.
	 * @see pollSystemUI.QuestionUI#getOptionsUI()
	 * @see #getQuestionUI()
	 * @generated
	 */
	EReference getQuestionUI_OptionsUI();

	/**
	 * Returns the meta object for class '{@link pollSystemUI.OptionUI <em>Option UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option UI</em>'.
	 * @see pollSystemUI.OptionUI
	 * @generated
	 */
	EClass getOptionUI();

	/**
	 * Returns the meta object for the attribute '{@link pollSystemUI.OptionUI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pollSystemUI.OptionUI#getId()
	 * @see #getOptionUI()
	 * @generated
	 */
	EAttribute getOptionUI_Id();

	/**
	 * Returns the meta object for the attribute '{@link pollSystemUI.OptionUI#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pollSystemUI.OptionUI#getType()
	 * @see #getOptionUI()
	 * @generated
	 */
	EAttribute getOptionUI_Type();

	/**
	 * Returns the meta object for enum '{@link pollSystemUI.TYPE_QUESTION <em>TYPE QUESTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TYPE QUESTION</em>'.
	 * @see pollSystemUI.TYPE_QUESTION
	 * @generated
	 */
	EEnum getTYPE_QUESTION();

	/**
	 * Returns the meta object for enum '{@link pollSystemUI.TYPE_OPTION <em>TYPE OPTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TYPE OPTION</em>'.
	 * @see pollSystemUI.TYPE_OPTION
	 * @generated
	 */
	EEnum getTYPE_OPTION();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PollSystemUIFactory getPollSystemUIFactory();

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
		 * The meta object literal for the '{@link pollSystemUI.impl.PollSystemUIImpl <em>Poll System UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pollSystemUI.impl.PollSystemUIImpl
		 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getPollSystemUI()
		 * @generated
		 */
		EClass POLL_SYSTEM_UI = eINSTANCE.getPollSystemUI();

		/**
		 * The meta object literal for the '<em><b>Polls UI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_SYSTEM_UI__POLLS_UI = eINSTANCE.getPollSystemUI_PollsUI();

		/**
		 * The meta object literal for the '{@link pollSystemUI.impl.PollUIImpl <em>Poll UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pollSystemUI.impl.PollUIImpl
		 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getPollUI()
		 * @generated
		 */
		EClass POLL_UI = eINSTANCE.getPollUI();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_UI__ID = eINSTANCE.getPollUI_Id();

		/**
		 * The meta object literal for the '<em><b>Questions UI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_UI__QUESTIONS_UI = eINSTANCE.getPollUI_QuestionsUI();

		/**
		 * The meta object literal for the '{@link pollSystemUI.impl.QuestionUIImpl <em>Question UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pollSystemUI.impl.QuestionUIImpl
		 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getQuestionUI()
		 * @generated
		 */
		EClass QUESTION_UI = eINSTANCE.getQuestionUI();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_UI__ID = eINSTANCE.getQuestionUI_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_UI__TYPE = eINSTANCE.getQuestionUI_Type();

		/**
		 * The meta object literal for the '<em><b>Options UI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_UI__OPTIONS_UI = eINSTANCE.getQuestionUI_OptionsUI();

		/**
		 * The meta object literal for the '{@link pollSystemUI.impl.OptionUIImpl <em>Option UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pollSystemUI.impl.OptionUIImpl
		 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getOptionUI()
		 * @generated
		 */
		EClass OPTION_UI = eINSTANCE.getOptionUI();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_UI__ID = eINSTANCE.getOptionUI_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_UI__TYPE = eINSTANCE.getOptionUI_Type();

		/**
		 * The meta object literal for the '{@link pollSystemUI.TYPE_QUESTION <em>TYPE QUESTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pollSystemUI.TYPE_QUESTION
		 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getTYPE_QUESTION()
		 * @generated
		 */
		EEnum TYPE_QUESTION = eINSTANCE.getTYPE_QUESTION();

		/**
		 * The meta object literal for the '{@link pollSystemUI.TYPE_OPTION <em>TYPE OPTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pollSystemUI.TYPE_OPTION
		 * @see pollSystemUI.impl.PollSystemUIPackageImpl#getTYPE_OPTION()
		 * @generated
		 */
		EEnum TYPE_OPTION = eINSTANCE.getTYPE_OPTION();

	}

} //PollSystemUIPackage
