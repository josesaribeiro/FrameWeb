/**
 */
package frameweb;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Naming Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.NamingMethod#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getNamingMethod()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface NamingMethod extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FrameWebName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getNamingMethod_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FrameWebName> getContains();

} // NamingMethod
