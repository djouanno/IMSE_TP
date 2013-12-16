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

import pollSystemUI.PollSystemUIPackage;
import pollSystemUI.PollUI;
import pollSystemUI.QuestionUI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pollSystemUI.impl.PollUIImpl#getId <em>Id</em>}</li>
 *   <li>{@link pollSystemUI.impl.PollUIImpl#getQuestionsUI <em>Questions UI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PollUIImpl extends MinimalEObjectImpl.Container implements PollUI {
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
	 * The cached value of the '{@link #getQuestionsUI() <em>Questions UI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionsUI()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionUI> questionsUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PollSystemUIPackage.Literals.POLL_UI;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PollSystemUIPackage.POLL_UI__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionUI> getQuestionsUI() {
		if (questionsUI == null) {
			questionsUI = new EObjectContainmentEList<QuestionUI>(QuestionUI.class, this, PollSystemUIPackage.POLL_UI__QUESTIONS_UI);
		}
		return questionsUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PollSystemUIPackage.POLL_UI__QUESTIONS_UI:
				return ((InternalEList<?>)getQuestionsUI()).basicRemove(otherEnd, msgs);
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
			case PollSystemUIPackage.POLL_UI__ID:
				return getId();
			case PollSystemUIPackage.POLL_UI__QUESTIONS_UI:
				return getQuestionsUI();
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
			case PollSystemUIPackage.POLL_UI__ID:
				setId((String)newValue);
				return;
			case PollSystemUIPackage.POLL_UI__QUESTIONS_UI:
				getQuestionsUI().clear();
				getQuestionsUI().addAll((Collection<? extends QuestionUI>)newValue);
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
			case PollSystemUIPackage.POLL_UI__ID:
				setId(ID_EDEFAULT);
				return;
			case PollSystemUIPackage.POLL_UI__QUESTIONS_UI:
				getQuestionsUI().clear();
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
			case PollSystemUIPackage.POLL_UI__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PollSystemUIPackage.POLL_UI__QUESTIONS_UI:
				return questionsUI != null && !questionsUI.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PollUIImpl
