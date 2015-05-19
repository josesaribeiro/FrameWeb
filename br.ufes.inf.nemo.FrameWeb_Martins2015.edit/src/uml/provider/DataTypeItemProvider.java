/**
 */
package uml.provider;


import frameweb.FramewebFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.DataType;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.DataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypeItemProvider extends ClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE);
			childrenFeatures.add(UmlPackage.Literals.DATA_TYPE__OWNED_OPERATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataType_type") :
			getString("_UI_DataType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataType.class)) {
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 UmlFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 UmlFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 UmlFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_ATTRIBUTE,
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				 UmlFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createFrontControllerMethod()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDomainOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createServiceOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.Literals.DATA_TYPE__OWNED_OPERATION,
				 FramewebFactory.eINSTANCE.createDAOOperation()));
	}

}