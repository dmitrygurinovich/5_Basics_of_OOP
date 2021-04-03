package by.epam.oop.logic;

import by.epam.oop.entity.Directory;
import by.epam.oop.entity.File;
import by.epam.oop.entity.TextFile;

public class TextEditor {

	public TextEditor() {
		
	}
	
	public TextFile createTextFile(Directory directory, File file) {
		return new TextFile(directory, file);
	}
	
	public void renameTextFile(TextFile textFile, String name) {
		textFile.getFile().setName(name);
	}
	
	public void addContent(TextFile textFile, String content) {
		textFile.getFile().setContent(textFile.getFile().getContent() + content);
	}
	
	public void deleteContent(TextFile textFile) {
		textFile.getFile().setContent("");
	}
}
