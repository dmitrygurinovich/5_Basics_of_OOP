package by.epam.oop.entity;

import java.io.Serializable;

public class TreasureChest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Ring ring;
	private Earring earring;
	private Necklace necklace;
	private Gem gem;
	private Gold gold;
	private int number;
	
	
	private static int defaultNumber = 1;
	
	/**
	 * @param ring
	 * @param earring
	 * @param necklace
	 * @param gem
	 * @param gold
	 */
	public TreasureChest(Ring ring, Earring earring, Necklace necklace, Gem gem, Gold gold) {
		this.setNumber(defaultNumber++);
		this.ring = ring;
		this.earring = earring;
		this.necklace = necklace;
		this.gem = gem;
		this.gold = gold;
	}

	/**
	 * @param ring
	 * @param earring
	 * @param necklace
	 * @param gem
	 */
	public TreasureChest(Ring ring, Earring earring, Necklace necklace, Gem gem) {
		this.setNumber(defaultNumber++);
		this.ring = ring;
		this.earring = earring;
		this.necklace = necklace;
		this.gem = gem;
	}

	/**
	 * @param ring
	 * @param earring
	 * @param necklace
	 * @param gold
	 */
	public TreasureChest(Ring ring, Earring earring, Necklace necklace, Gold gold) {
		this.setNumber(defaultNumber++);
		this.ring = ring;
		this.earring = earring;
		this.necklace = necklace;
		this.gold = gold;
	}

	/**
	 * @param ring
	 * @param earring
	 * @param gem
	 * @param gold
	 */
	public TreasureChest(Ring ring, Earring earring, Gem gem, Gold gold) {
		this.setNumber(defaultNumber++);
		this.ring = ring;
		this.earring = earring;
		this.gem = gem;
		this.gold = gold;
	}

	/**
	 * @param ring
	 * @param necklace
	 * @param gem
	 * @param gold
	 */
	public TreasureChest(Ring ring, Necklace necklace, Gem gem, Gold gold) {
		this.setNumber(defaultNumber++);
		this.ring = ring;
		this.necklace = necklace;
		this.gem = gem;
		this.gold = gold;
	}

	/**
	 * @param earring
	 * @param necklace
	 * @param gem
	 * @param gold
	 */
	public TreasureChest(Earring earring, Necklace necklace, Gem gem, Gold gold) {
		this.setNumber(defaultNumber++);
		this.earring = earring;
		this.necklace = necklace;
		this.gem = gem;
		this.gold = gold;
	}

	public TreasureChest() {

	}

	public Ring getRing() {
		return ring;
	}

	public void setRing(Ring ring) {
		this.ring = ring;
	}

	public Earring getEarring() {
		return earring;
	}

	public void setEarring(Earring earring) {
		this.earring = earring;
	}

	public Necklace getNecklace() {
		return necklace;
	}

	public void setNecklace(Necklace necklace) {
		this.necklace = necklace;
	}

	public Gem getGem() {
		return gem;
	}

	public void setGem(Gem gem) {
		this.gem = gem;
	}

	public Gold getGold() {
		return gold;
	}

	public void setGold(Gold gold) {
		this.gold = gold;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((earring == null) ? 0 : earring.hashCode());
		result = prime * result + ((gem == null) ? 0 : gem.hashCode());
		result = prime * result + ((gold == null) ? 0 : gold.hashCode());
		result = prime * result + ((necklace == null) ? 0 : necklace.hashCode());
		result = prime * result + ((ring == null) ? 0 : ring.hashCode());
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
		TreasureChest other = (TreasureChest) obj;
		if (earring == null) {
			if (other.earring != null)
				return false;
		} else if (!earring.equals(other.earring))
			return false;
		if (gem == null) {
			if (other.gem != null)
				return false;
		} else if (!gem.equals(other.gem))
			return false;
		if (gold == null) {
			if (other.gold != null)
				return false;
		} else if (!gold.equals(other.gold))
			return false;
		if (necklace == null) {
			if (other.necklace != null)
				return false;
		} else if (!necklace.equals(other.necklace))
			return false;
		if (ring == null) {
			if (other.ring != null)
				return false;
		} else if (!ring.equals(other.ring))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Treasure chest #" + number + ":\n" 
				+ (ring != null ? ring + "\n" : "")
				+ (earring != null ? earring + "\n" : "")
				+ (necklace != null ? necklace + "\n" : "") 
				+ (gem != null ? gem + "\n" : "")
				+ (gold != null ? gold + "\n" : "");
	}

}
