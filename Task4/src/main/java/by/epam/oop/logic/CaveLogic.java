package by.epam.oop.logic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.epam.oop.entity.Cave;

public class CaveLogic {

	public CaveLogic() {

	}

	public void writeToFile(Cave cave) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("resourses/base.out"));
		out.writeObject(cave);
		out.close();
	}

	public Cave readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("resourses/base.out"));
		Cave caveFromFile = (Cave) in.readObject();
		in.close();
		return caveFromFile;
	}

}
