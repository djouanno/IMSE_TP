/**
 */
package pollSystemUI.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pollSystemUI.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PollSystemUIFactoryImpl extends EFactoryImpl implements PollSystemUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PollSystemUIFactory init() {
		try {
			PollSystemUIFactory thePollSystemUIFactory = (PollSystemUIFactory)EPackage.Registry.INSTANCE.getEFactory(PollSystemUIPackage.eNS_URI);
			if (thePollSystemUIFactory != null) {
				return thePollSystemUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PollSystemUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollSystemUIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PollSystemUIPackage.POLL_SYSTEM_UI: return createPollSystemUI();
			case PollSystemUIPackage.POLL_UI: return createPollUI();
			case PollSystemUIPackage.QUESTION_UI: return createQuestionUI();
			case PollSystemUIPackage.OPTION_UI: return createOptionUI();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PollSystemUIPackage.TYPE_QUESTION:
				return createTYPE_QUESTIONFromString(eDataType, initialValue);
			case PollSystemUIPackage.TYPE_OPTION:
				return createTYPE_OPTIONFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PollSystemUIPackage.TYPE_QUESTION:
				return convertTYPE_QUESTIONToString(eDataType, instanceValue);
			case PollSystemUIPackage.TYPE_OPTION:
				return convertTYPE_OPTIONToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollSystemUI createPollSystemUI() {
		PollSystemUIImpl pollSystemUI = new PollSystemUIImpl();
		return pollSystemUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollUI createPollUI() {
		PollUIImpl pollUI = new PollUIImpl();
		return pollUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionUI createQuestionUI() {
		QuestionUIImpl questionUI = new QuestionUIImpl();
		return questionUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionUI createOptionUI() {
		OptionUIImpl optionUI = new OptionUIImpl();
		return optionUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPE_QUESTION createTYPE_QUESTIONFromString(EDataType eDataType, String initialValue) {
		TYPE_QUESTION result = TYPE_QUESTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTYPE_QUESTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPE_OPTION createTYPE_OPTIONFromString(EDataType eDataType, String initialValue) {
		TYPE_OPTION result = TYPE_OPTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTYPE_OPTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollSystemUIPackage getPollSystemUIPackage() {
		return (PollSystemUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PollSystemUIPackage getPackage() {
		return PollSystemUIPackage.eINSTANCE;
	}

} //PollSystemUIFactoryImpl
