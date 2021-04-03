package by.epam.oop.main;

import by.epam.oop.entity.*;
import by.epam.oop.logic.TextEditor;
import by.epam.oop.view.View;

/*
 * 1. Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, 
 * вывести на консоль содержимое, дополнить, удалить.
 */
public class Main {
	public static void main(String[] args) {
	
		TextEditor editor = new TextEditor();
		View view = new View();
			
		TextFile textFile = editor.createTextFile(new Directory("C:\\Users\\Dmitry Gurinovich\\Desktop\\"), new File("text", "Hello, world!"));
		view.print(textFile);
		
		editor.renameTextFile(textFile, "newName");
		view.print(textFile);
		
		editor.addContent(textFile, " Hello, Dmitry!");
		view.print(textFile);
		
		editor.deleteContent(textFile);
		view.print(textFile);

	}
}
