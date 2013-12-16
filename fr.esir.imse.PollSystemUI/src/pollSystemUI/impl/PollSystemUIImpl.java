/**
 */
package pollSystemUI.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pollSystemUI.PollSystemUI;
import pollSystemUI.PollSystemUIPackage;
import pollSystemUI.PollUI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll System UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pollSystemUI.impl.PollSystemUIImpl#getPollsUI <em>Polls UI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PollSystemUIImpl extends MinimalEObjectImpl.Container implements PollSystemUI {
	/**
	 * The cached value of the '{@link #getPollsUI() <em>Polls UI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollsUI()
	 * @generated
	 * @ordered
	 */
	protected EList<PollUI> pollsUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollSystemUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PollSystemUIPackage.Literals.POLL_SYSTEM_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PollUI> getPollsUI() {
		if (pollsUI == null) {
			pollsUI = new EObjectContainmentEList<PollUI>(PollUI.class, this, PollSystemUIPackage.POLL_SYSTEM_UI__POLLS_UI);
		}
		return pollsUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PollSystemUIPackage.POLL_SYSTEM_UI__POLLS_UI:
				return ((InternalEList<?>)getPollsUI()).basicRemove(otherEnd, msgs);
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
			case PollSystemUIPackage.POLL_SYSTEM_UI__POLLS_UI:
				return getPollsUI();
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
			case PollSystemUIPackage.POLL_SYSTEM_UI__POLLS_UI:
				getPollsUI().clear();
				getPollsUI().addAll((Collection<? extends PollUI>)newValue);
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
			case PollSystemUIPackage.POLL_SYSTEM_UI__POLLS_UI:
				getPollsUI().clear();
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
			case PollSystemUIPackage.POLL_SYSTEM_UI__POLLS_UI:
				return pollsUI != null && !pollsUI.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PollSystemUIImpl
