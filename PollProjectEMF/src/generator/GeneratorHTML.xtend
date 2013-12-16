package generator

import UiElement.Input.Input
import UiElement.Input.impl.CheckboxImpl
import UiElement.Input.impl.DropdownImpl
import UiElement.Input.impl.RadioImpl
import UiElement.Panel
import UiElement.Question
import java.util.List

class GeneratorHTML {

	def static doGenerate(List<Panel> panels) {
		return '''
			<div>
				«FOR panel : panels»
					«compile(panel)»
				«ENDFOR»
			</div>
			<button name="">Envoyer</button>
		'''
	}

	def static String compile(Panel panel) {
		return '''
			<form action="" method="post">
				«FOR question : panel.questions»
					«compile(question)»
				«ENDFOR»
			</form>
		'''
	}

	def static compile(Question question) {
		return '''
			<div>
				<h3>«question.text»</h3>
				«FOR input : question.inputs»
					«compile(input, question)»
				«ENDFOR»
			</div>
		'''
	}

	def static compile(Input input, Question question) {
		return '''
		«IF input.class.equals(CheckboxImpl) »
		<input type="checkbox" name="«question.id»" id="«input.id»" /><label for="«input.id»">«input.text»</label><br />
		«ENDIF»
		«IF input.class.equals(RadioImpl) »
		<input type="radio" name="«question.id»" id="«input.id»" /><label for="«input.id»">«input.text»</label><br />
		«ENDIF»
		«IF input.class.equals(DropdownImpl) »
		<input type="radio" name="«question.id»" id="«input.id»" /><label for="«input.id»">«input.text»</label><br />
		«ENDIF»		
		'''
	}
}
