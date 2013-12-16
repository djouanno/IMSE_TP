/**
 */
package pollSystemUI.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pollSystemUI.OptionUI;
import pollSystemUI.PollSystemUIPackage;
import pollSystemUI.QuestionUI;
import pollSystemUI.TYPE_QUESTION;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pollSystemUI.impl.QuestionUIImpl#getId <em>Id</em>}</li>
 *   <li>{@link pollSystemUI.impl.QuestionUIImpl#getType <em>Type</em>}</li>
 *   <li>{@link pollSystemUI.impl.QuestionUIImpl#getOptionsUI <em>Options UI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionUIImpl extends MinimalEObjectImpl.Container implements QuestionUI {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TYPE_QUESTION TYPE_EDEFAULT = TYPE_QUESTION.LABEL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TYPE_QUESTION type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionsUI() <em>Options UI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsUI()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionUI> optionsUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PollSystemUIPackage.Literals.QUESTION_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PollSystemUIPackage.QUESTION_UI__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPE_QUESTION getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TYPE_QUESTION newType) {
		TYPE_QUESTION oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PollSystemUIPackage.QUESTION_UI__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionUI> getOptionsUI() {
		if (optionsUI == null) {
			optionsUI = new EObjectContainmentEList<OptionUI>(OptionUI.class, this, PollSystemUIPackage.QUESTION_UI__OPTIONS_UI);
		}
		return optionsUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PollSystemUIPackage.QUESTION_UI__OPTIONS_UI:
				return ((InternalEList<?>)getOptionsUI()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PollSystemUIPackage.QUESTION_UI__ID:
				return getId();
			case PollSystemUIPackage.QUESTION_UI__TYPE:
				return getType();
			case PollSystemUIPackage.QUESTION_UI__OPTIONS_UI:
				return getOptionsUI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PollSystemUIPackage.QUESTION_UI__ID:
				setId((String)newValue);
				return;
			case PollSystemUIPackage.QUESTION_UI__TYPE:
				setType((TYPE_QUESTION)newValue);
				return;
			case PollSystemUIPackage.QUESTION_UI__OPTIONS_UI:
				getOptionsUI().clear();
				getOptionsUI().addAll((Collection<? extends OptionUI>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PollSystemUIPackage.QUESTION_UI__ID:
				setId(ID_EDEFAULT);
				return;
			case PollSystemUIPackage.QUESTION_UI__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PollSystemUIPackage.QUESTION_UI__OPTIONS_UI:
				getOptionsUI().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PollSystemUIPackage.QUESTION_UI__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PollSystemUIPackage.QUESTION_UI__TYPE:
				return type != TYPE_EDEFAULT;
			case PollSystemUIPackage.QUESTION_UI__OPTIONS_UI:
				return optionsUI != null && !optionsUI.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //QuestionUIImpl
