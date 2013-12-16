package generator

import java.io.File
import java.io.FileWriter
import java.io.IOException

/**
 * Launch the MMUi generator and HTML generator
 */
class Launcher {

	static def void main(String[] args) {

		var generator = new GeneratorMMUi;

		var result = GeneratorHTML.doGenerate(generator.doGenerate);
		writeFileObject("file/generate/poll.html", result)
		print(result)

	}

	/**
	 * Write model into file.
	 */
	def static writeFileObject(String url, String append) {
		var file = new File(url);
		try {
			var fw = new FileWriter(file, true);
			fw.write(append);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
