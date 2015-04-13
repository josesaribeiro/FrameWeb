/**
 */
package frameweb.provider;


import frameweb.DomainClass;
import frameweb.FrameWebFactory;
import frameweb.FrameWebPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.Uml2Package;

import uml2.provider.ClassItemProvider;

/**
 * This is the item provider adapter for a {@link frameweb.DomainClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainClassItemProvider extends ClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClassItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE);
			childrenFeatures.add(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DomainClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DomainClass_type") :
			getString("_UI_DomainClass_type") + " " + label;
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

		switch (notification.getFeatureID(DomainClass.class)) {
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
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
				(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE,
				 FrameWebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE,
				 FrameWebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE,
				 FrameWebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE,
				 FrameWebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE,
				 FrameWebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE,
				 FrameWebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE,
				 FrameWebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION,
				 FrameWebFactory.eINSTANCE.createDomainOperation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Uml2Package.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == Uml2Package.Literals.CLASS__NESTED_CLASSIFIER ||
			childFeature == Uml2Package.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE ||
			childFeature == FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE ||
			childFeature == Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR ||
			childFeature == Uml2Package.Literals.CLASS__OWNED_OPERATION ||
			childFeature == FrameWebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FrameWeb_Martins2015EditPlugin.INSTANCE;
	}

}
