package by.epam.oop.entity;

import java.io.Serializable;

public class Earring extends Treasure implements Serializable {

	private static final long serialVersionUID = 1L;

	public Earring(String name, int cost) {
		super(name, cost);
	}

	public Earring() {
		
	}
}
