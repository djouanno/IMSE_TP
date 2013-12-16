/**
 */
package pollSystemUI.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pollSystemUI.OptionUI;
import pollSystemUI.PollSystemUI;
import pollSystemUI.PollSystemUIFactory;
import pollSystemUI.PollSystemUIPackage;
import pollSystemUI.PollUI;
import pollSystemUI.QuestionUI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PollSystemUIPackageImpl extends EPackageImpl implements PollSystemUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollSystemUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typE_QUESTIONEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typE_OPTIONEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pollSystemUI.PollSystemUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PollSystemUIPackageImpl() {
		super(eNS_URI, PollSystemUIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PollSystemUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PollSystemUIPackage init() {
		if (isInited) return (PollSystemUIPackage)EPackage.Registry.INSTANCE.getEPackage(PollSystemUIPackage.eNS_URI);

		// Obtain or create and register package
		PollSystemUIPackageImpl thePollSystemUIPackage = (PollSystemUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PollSystemUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PollSystemUIPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePollSystemUIPackage.createPackageContents();

		// Initialize created meta-data
		thePollSystemUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePollSystemUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PollSystemUIPackage.eNS_URI, thePollSystemUIPackage);
		return thePollSystemUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollSystemUI() {
		return pollSystemUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollSystemUI_PollsUI() {
		return (EReference)pollSystemUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollUI() {
		return pollUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollUI_Id() {
		return (EAttribute)pollUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollUI_QuestionsUI() {
		return (EReference)pollUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionUI() {
		return questionUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionUI_Id() {
		return (EAttribute)questionUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionUI_Type() {
		return (EAttribute)questionUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionUI_OptionsUI() {
		return (EReference)questionUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionUI() {
		return optionUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionUI_Id() {
		return (EAttribute)optionUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionUI_Type() {
		return (EAttribute)optionUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTYPE_QUESTION() {
		return typE_QUESTIONEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTYPE_OPTION() {
		return typE_OPTIONEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollSystemUIFactory getPollSystemUIFactory() {
		return (PollSystemUIFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pollSystemUIEClass = createEClass(POLL_SYSTEM_UI);
		createEReference(pollSystemUIEClass, POLL_SYSTEM_UI__POLLS_UI);

		pollUIEClass = createEClass(POLL_UI);
		createEAttribute(pollUIEClass, POLL_UI__ID);
		createEReference(pollUIEClass, POLL_UI__QUESTIONS_UI);

		questionUIEClass = createEClass(QUESTION_UI);
		createEAttribute(questionUIEClass, QUESTION_UI__ID);
		createEAttribute(questionUIEClass, QUESTION_UI__TYPE);
		createEReference(questionUIEClass, QUESTION_UI__OPTIONS_UI);

		optionUIEClass = createEClass(OPTION_UI);
		createEAttribute(optionUIEClass, OPTION_UI__ID);
		createEAttribute(optionUIEClass, OPTION_UI__TYPE);

		// Create enums
		typE_QUESTIONEEnum = createEEnum(TYPE_QUESTION);
		typE_OPTIONEEnum = createEEnum(TYPE_OPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pollSystemUIEClass, PollSystemUI.class, "PollSystemUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPollSystemUI_PollsUI(), this.getPollUI(), null, "pollsUI", null, 0, -1, PollSystemUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollUIEClass, PollUI.class, "PollUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollUI_Id(), ecorePackage.getEString(), "id", null, 0, 1, PollUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPollUI_QuestionsUI(), this.getQuestionUI(), null, "questionsUI", null, 0, -1, PollUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionUIEClass, QuestionUI.class, "QuestionUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionUI_Id(), ecorePackage.getEString(), "id", null, 0, 1, QuestionUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionUI_Type(), this.getTYPE_QUESTION(), "type", null, 0, 1, QuestionUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionUI_OptionsUI(), this.getOptionUI(), null, "optionsUI", null, 0, -1, QuestionUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionUIEClass, OptionUI.class, "OptionUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionUI_Id(), ecorePackage.getEString(), "id", null, 0, 1, OptionUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionUI_Type(), this.getTYPE_OPTION(), "type", null, 0, 1, OptionUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typE_QUESTIONEEnum, pollSystemUI.TYPE_QUESTION.class, "TYPE_QUESTION");
		addEEnumLiteral(typE_QUESTIONEEnum, pollSystemUI.TYPE_QUESTION.LABEL);

		initEEnum(typE_OPTIONEEnum, pollSystemUI.TYPE_OPTION.class, "TYPE_OPTION");
		addEEnumLiteral(typE_OPTIONEEnum, pollSystemUI.TYPE_OPTION.CHECKBOX);
		addEEnumLiteral(typE_OPTIONEEnum, pollSystemUI.TYPE_OPTION.LABEL);
		addEEnumLiteral(typE_OPTIONEEnum, pollSystemUI.TYPE_OPTION.RADIO);
		addEEnumLiteral(typE_OPTIONEEnum, pollSystemUI.TYPE_OPTION.DROPDOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //PollSystemUIPackageImpl
