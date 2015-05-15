/**
 *
 * $Id$
 */
package frameweb.validation;

import frameweb.DomainClass;
import frameweb.InheritanceMapping;

/**
 * A sample validator interface for {@link frameweb.DomainGeneralization}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DomainGeneralizationValidator {
	boolean validate();

	boolean validateMapping(InheritanceMapping value);
	boolean validateTargetDomain(DomainClass value);
	boolean validateSourceDomain(DomainClass value);
}
