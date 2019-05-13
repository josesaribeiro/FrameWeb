package br.ufes.inf.nemo.frameweb.codegenerator.e4;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import com.google.inject.Guice;
import com.google.inject.Injector;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.ApplicationModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.EntityModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.ModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.NavigationModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.PersistenceModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.modules.FrameWebModule;
import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel;

public class CodeGenerator implements IExternalJavaAction {
	
	private Injector injector;
	private ProjectConfiguration projectConfiguration;
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		boolean canExecute = selections
			.stream()
			.anyMatch(DSemanticDiagram.class::isInstance);
		
		if (canExecute) {
			injector = Guice.createInjector(new FrameWebModule());
			projectConfiguration = injector.getInstance(ProjectConfiguration.class);
		}
		
		return canExecute;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		DiagramRepresentation diagram = new DiagramRepresentation(selections);

		projectConfiguration.setConfiguration(diagram.getFrameWebConfiguration());
		
		if (diagram.hasEntityModel() && diagram.hasORMTemplate()) {
			EntityModel model = diagram.getEntityModel();
			ORMTemplate template = diagram.getORMTemplate();
			
			ModelCodeGenerator entityModelCodeGenerator = 
					new EntityModelCodeGenerator(model, template, projectConfiguration);

			entityModelCodeGenerator.generate();
		}

		if (diagram.hasNavigationModel() && diagram.hasFrontControllerTemplate()) {
			NavigationModel model = diagram.getNavigationModel();
			FrontControllerTemplate template = diagram.getFrontControllerTemplate();
			
			ModelCodeGenerator navigationModelCodeGenerator =
					new NavigationModelCodeGenerator(model, template, projectConfiguration);

			navigationModelCodeGenerator.generate();
		}
		
		if (diagram.hasApplicationModel() && diagram.hasDITemplate()) {
			ApplicationModel model = diagram.getApplicationModel();
			DITemplate template = diagram.getDITemplate();
			
			ModelCodeGenerator applicationModelCodeGenerator = 
					new ApplicationModelCodeGenerator(model, template, projectConfiguration);
			
			applicationModelCodeGenerator.generate();
		}
		
		if (diagram.hasPersistenceModel() && diagram.hasDAOTemplate()) {
			PersistenceModel model = diagram.getPersistenceModel();
			DAOTemplate template = diagram.getDAOTemplate();
			
			ModelCodeGenerator persistenceModelCodeGenerator = 
					new PersistenceModelCodeGenerator(model, template, projectConfiguration);
		
			persistenceModelCodeGenerator.generate();
		}
	}

}