/**
 */
package uml2.provider;


import frameweb.FrameWebFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2.AssociationClass;
import uml2.Uml2Factory;
import uml2.Uml2Package;

/**
 * This is the item provider adapter for a {@link uml2.AssociationClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationClassItemProvider extends ClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClassItemProvider(AdapterFactory adapterFactory) {
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

			addRelatedElementPropertyDescriptor(object);
			addEndTypePropertyDescriptor(object);
			addIsDerivedPropertyDescriptor(object);
			addNavigableOwnedEndPropertyDescriptor(object);
			addMemberEndPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Related Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Relationship_relatedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Relationship_relatedElement_feature", "_UI_Relationship_type"),
				 Uml2Package.Literals.RELATIONSHIP__RELATED_ELEMENT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_endType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_endType_feature", "_UI_Association_type"),
				 Uml2Package.Literals.ASSOCIATION__END_TYPE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_isDerived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_isDerived_feature", "_UI_Association_type"),
				 Uml2Package.Literals.ASSOCIATION__IS_DERIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Navigable Owned End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNavigableOwnedEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_navigableOwnedEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_navigableOwnedEnd_feature", "_UI_Association_type"),
				 Uml2Package.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Member End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Association_memberEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Association_memberEnd_feature", "_UI_Association_type"),
				 Uml2Package.Literals.ASSOCIATION__MEMBER_END,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(Uml2Package.Literals.ASSOCIATION__OWNED_END);
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
	 * This returns AssociationClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociationClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AssociationClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AssociationClass_type") :
			getString("_UI_AssociationClass_type") + " " + label;
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

		switch (notification.getFeatureID(AssociationClass.class)) {
			case Uml2Package.ASSOCIATION_CLASS__IS_DERIVED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Uml2Package.ASSOCIATION_CLASS__OWNED_END:
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
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 Uml2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 Uml2Factory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 Uml2Factory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createDomainAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2Package.Literals.ASSOCIATION__OWNED_END,
				 FrameWebFactory.eINSTANCE.createFormComponent()));
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
			childFeature == Uml2Package.Literals.ASSOCIATION__OWNED_END ||
			childFeature == Uml2Package.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
