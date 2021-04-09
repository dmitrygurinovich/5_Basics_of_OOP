package by.epam.oop.entity;

import java.io.Serializable;

public class Ring extends Treasure implements Serializable {

	private static final long serialVersionUID = 1L;

	public Ring(String name, int cost) {
		super(name, cost);
	}

	public Ring() {
		
	}
}
