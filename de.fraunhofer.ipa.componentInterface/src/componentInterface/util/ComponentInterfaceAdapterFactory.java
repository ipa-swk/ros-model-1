/**
 */
package componentInterface.util;

import componentInterface.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ros.NamespacedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see componentInterface.ComponentInterfacePackage
 * @generated
 */
public class ComponentInterfaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentInterfacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentInterfacePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceSwitch<Adapter> modelSwitch =
		new ComponentInterfaceSwitch<Adapter>() {
			@Override
			public Adapter caseComponentInterface(ComponentInterface object) {
				return createComponentInterfaceAdapter();
			}
			@Override
			public Adapter casePublisher(Publisher object) {
				return createPublisherAdapter();
			}
			@Override
			public Adapter caseSubscriber(Subscriber object) {
				return createSubscriberAdapter();
			}
			@Override
			public Adapter caseServiceServer(ServiceServer object) {
				return createServiceServerAdapter();
			}
			@Override
			public Adapter caseServiceClient(ServiceClient object) {
				return createServiceClientAdapter();
			}
			@Override
			public Adapter caseNamespacedElement(NamespacedElement object) {
				return createNamespacedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link componentInterface.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentInterface.ComponentInterface
	 * @generated
	 */
	public Adapter createComponentInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentInterface.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentInterface.Publisher
	 * @generated
	 */
	public Adapter createPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentInterface.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentInterface.Subscriber
	 * @generated
	 */
	public Adapter createSubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentInterface.ServiceServer <em>Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentInterface.ServiceServer
	 * @generated
	 */
	public Adapter createServiceServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link componentInterface.ServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see componentInterface.ServiceClient
	 * @generated
	 */
	public Adapter createServiceClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.NamespacedElement <em>Namespaced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.NamespacedElement
	 * @generated
	 */
	public Adapter createNamespacedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComponentInterfaceAdapterFactory