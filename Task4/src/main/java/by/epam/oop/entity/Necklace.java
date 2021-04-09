package by.epam.oop.entity;

import java.io.Serializable;

public class Necklace extends Treasure implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Necklace(String name, int cost) {
		super(name, cost);
	}

	public Necklace() {
		
	}

}
