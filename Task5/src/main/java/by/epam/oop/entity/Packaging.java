package by.epam.oop.entity;

public enum Packaging {
	CARDBOARD_BOX("Cardboard box", 12), 
	CRAFT_PAPER("Craft paper", 7), 
	PACKAGE("Package", 3);
	
	final private String name;
	final private int cost;
	
	Packaging(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
	@Override
	public String toString() {
		return "Packaging: \"" + name + "\" - " + cost + " BYN";
	}
	
}
