package by.epam.oop.entity;

import java.io.Serializable;

public class Gold implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int numberOfCoins;

	public Gold(int numberOfCoins) {
		this.numberOfCoins = numberOfCoins;
	}

	public Gold() {
		
	}

	public int getNumberOfCoins() {
		return numberOfCoins;
	}

	public void setNumberOfCoins(int numberOfCoins) {
		this.numberOfCoins = numberOfCoins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfCoins;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gold other = (Gold) obj;
		if (numberOfCoins != other.numberOfCoins)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\"Gold\" - " + numberOfCoins + " coins" ;
	}
	
}
