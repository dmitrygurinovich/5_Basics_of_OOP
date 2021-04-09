package by.epam.oop.entity;

import java.io.Serializable;

public class Gem extends Treasure implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Gem(String name, int cost) {
		super(name, cost);
	}
	
	public Gem() {
		
	}	
}
	