package generator

import UiElement.Input.Input
import UiElement.Input.InputFactory
import UiElement.Panel
import UiElement.UiElementFactory
import fr.esir.imse.PollSystemStandaloneSetup
import fr.esir.imse.PollSystemUIStandaloneSetup
import fr.esir.imse.pollSystem.Option
import fr.esir.imse.pollSystem.Poll
import fr.esir.imse.pollSystem.Question
import fr.esir.imse.pollSystemUI.OptionUI
import fr.esir.imse.pollSystemUI.PollUI
import fr.esir.imse.pollSystemUI.QuestionUI
import fr.esir.imse.pollSystemUI.TYPE_OPTION
import java.io.File
import java.util.Collections
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

/**
 * This class take PollSystem Model and PollSystemUI model to transform them in MMUi model.
 */
class GeneratorMMUi {
	
	/**
	 * Generate and return the MMUi model.
	 */
	def doGenerate() {
		PollSystemStandaloneSetup.doSetup
		PollSystemUIStandaloneSetup.doSetup

		var List<Panel> panels = new LinkedList;
		var polls = readModel("file/poll.ps").filter(Poll)
		var pollsUI = readModel("file/pollSystemUI.pollUI").filter(PollUI)

		for (i : 0 ..< polls.size) {
			panels.add(compile(polls.get(i), pollsUI.get(i)))
		}
		saveModel("file/truc.modelMMUI", panels)
		return panels
	}

	/**
	 * Read model from url.
	 */
	def readModel(String url) {
		var ResourceSet resourceSet = new ResourceSetImpl();
		return resourceSet.getResource(URI.createURI(url), true).allContents.toList
	}

	/**
	 * Generate MMUi model from Poll and PollUi
	 */
	def compile(Poll poll, PollUI pollUI) {
		var panel = UiElementFactory.eINSTANCE.createPanel;
		panel.setId(poll.id)
		
		for (Question question : poll.questions) {

			var questionsUI = pollUI.questionsUI.filter[questionUI|questionUI.id == question.id]
			if (questionsUI.size() == 1)
				panel.questions.add(compile(question, questionsUI.get(0)))
		}
		return panel
	}

	/**
	 * Generate MMUi model from Question and QuestionUI
	 */
	def compile(Question question, QuestionUI questionUI) {
		var questionMMui = UiElementFactory.eINSTANCE.createQuestion;

		questionMMui.setId(question.id);
		questionMMui.setText(question.text)

		for (Option option : question.options) {
			var optionsUI = questionUI.optionsUI.filter[optionUI|optionUI.id == option.id]
			if (optionsUI.size() == 1)
				questionMMui.inputs.add(compile(option, optionsUI.get(0)))
		}
		return questionMMui
	}
	
	/**
	 * Generate MMUi model from Option and OptionUI
	 */
	def compile(Option option, OptionUI optionUI) {

		var Input input = null;

		if (optionUI.type == TYPE_OPTION.CHECKBOX)
			input = InputFactory.eINSTANCE.createCheckbox
		else if (optionUI.type == TYPE_OPTION.RADIO)
			input = InputFactory.eINSTANCE.createRadio
		else if (optionUI.type == TYPE_OPTION.TEXT)
			input = InputFactory.eINSTANCE.createText
		else if (optionUI.type == TYPE_OPTION.DROPDOWN)
			input = InputFactory.eINSTANCE.createDropdown
		


		input.setId(option.id)
		input.setText(option.text)

		return input
	}

	/**
	 * Save MMUi model in XMI file.
	 */
	def saveModel(String url, List<Panel> models) {

		// Create a resource set.
		var ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Get the URI of the model file.
		var URI fileURI = URI.createFileURI(new File(url).getAbsolutePath());

		// Create a resource for this file.
		var Resource resource = resourceSet.createResource(fileURI);
		for(EObject model : models)
			resource.contents.add(model)

		// Save the contents of the resource to the file system.
		resource.save(Collections.EMPTY_MAP);
	}
}