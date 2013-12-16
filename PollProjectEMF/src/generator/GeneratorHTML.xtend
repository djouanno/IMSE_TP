package generator

import UiElement.Input.Input
import UiElement.Input.impl.CheckboxImpl
import UiElement.Input.impl.RadioImpl
import UiElement.Input.impl.TextImpl
import UiElement.Panel
import UiElement.Question
import java.util.List

/**
 * This class transforms a MMUi model to HTML.
 */
class GeneratorHTML {

	/**
	 * Generate HTML model from panel list.
	 */
	def static doGenerate(List<Panel> panels) {
		return '''
			<div>
				«FOR panel : panels»
					«compile(panel)»
				«ENDFOR»
			</div>
		'''
	}

	/**
	 * Generate HTML from panel
	 */
	def static String compile(Panel panel) {
		return '''
			<form action="" method="post">
				«FOR question : panel.questions»
					«compile(question)»
				«ENDFOR»
				<br/><br/>
				<button type="submit" name="">Envoyer</button>
			</form>
		'''
	}

	/**
	 * Generate HTML from Question
	 */
	def static compile(Question question) {
		return '''
			<div id="«question.id»">
				<h3>«question.text»</h3>
				«FOR input : question.inputs»
					«compile(input, question)»
				«ENDFOR»
			</div>
		'''
	}

	/**
	 * Generate HTML from input
	 */
	def static compile(Input input, Question question) {
		return '''
		«IF input.class.equals(CheckboxImpl) »
		<input type="checkbox" name="«question.id»" id="«input.id»" /><label for="«input.id»">«input.text»</label><br />
		«ENDIF»
		«IF input.class.equals(RadioImpl) »
		<input type="radio" name="«question.id»" id="«input.id»" /><label for="«input.id»">«input.text»</label><br />
		«ENDIF»
		«IF input.class.equals(TextImpl) »
		<input type="text" name="«question.id»" id="«input.id»" /><label for="«input.id»">«input.text»</label><br />
		«ENDIF»		
		'''
	}
}
