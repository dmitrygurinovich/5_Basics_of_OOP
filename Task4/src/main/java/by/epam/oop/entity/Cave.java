package by.epam.oop.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Cave implements Serializable {

	private static final long serialVersionUID = 1L;

	ArrayList<TreasureChest> cheastList = new ArrayList<>();

	public Cave(ArrayList<TreasureChest> cheastList) {
		this.cheastList = cheastList;
	}

	public Cave(TreasureChest... treasureChests) {
		this.cheastList = new ArrayList<>(Arrays.asList(treasureChests));
	}

	public Cave() {
		
	}

	public ArrayList<TreasureChest> getCheastList() {
		return cheastList;
	}

	public void setCheastList(ArrayList<TreasureChest> cheastList) {
		this.cheastList = cheastList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cheastList == null) ? 0 : cheastList.hashCode());
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
		Cave other = (Cave) obj;
		if (cheastList == null) {
			if (other.cheastList != null)
				return false;
		} else if (!cheastList.equals(other.cheastList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("");
		for (TreasureChest treasureChest : cheastList) {
			result.append(treasureChest + "\n");
		}
		return result.toString();
	}

}
