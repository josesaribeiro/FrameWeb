/**
 *
 * $Id$
 */
package frameweb.validation;

import frameweb.FrontControllerClass;
import frameweb.FrontControllerMethod;

/**
 * A sample validator interface for {@link frameweb.ChainingDependence}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ChainingDependenceValidator {
	boolean validate();

	boolean validateOutMethod(FrontControllerMethod value);
	boolean validateInMethod(FrontControllerMethod value);
	boolean validateTargetFrontController(FrontControllerClass value);
	boolean validateSourceFrontController(FrontControllerClass value);
}