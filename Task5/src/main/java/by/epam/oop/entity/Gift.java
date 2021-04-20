package by.epam.oop.entity;

public class Gift {
	private Bar bar;
	private Lollipops lollipops;
	private Soda soda;
	private СhocolateСandies chocolateСandies;
	private Сookie cookie;
	private Packaging packaging;
	private int totalCost;

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public Lollipops getLollipops() {
		return lollipops;
	}

	public void setLollipops(Lollipops lollipops) {
		this.lollipops = lollipops;
	}

	public Soda getSoda() {
		return soda;
	}

	public void setSoda(Soda soda) {
		this.soda = soda;
	}

	public СhocolateСandies getChocolateСandies() {
		return chocolateСandies;
	}

	public void setChocolateСandies(СhocolateСandies chocolateСandies) {
		this.chocolateСandies = chocolateСandies;
	}

	public Сookie getCookie() {
		return cookie;
	}

	public void setCookie(Сookie cookie) {
		this.cookie = cookie;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public static class Builder {
		private Gift newGift;

		public Builder() {
			newGift = new Gift();
		}

		public Builder withBar(String name, int cost) {
			newGift.bar = new Bar(name, cost);
			return this;
		}

		public Builder withLollipops(String name, int cost) {
			newGift.lollipops = new Lollipops(name, cost);
			return this;
		}

		public Builder withSoda(String name, int cost) {
			newGift.soda = new Soda(name, cost);
			return this;
		}

		public Builder withСhocolateСandies(String name, int cost) {
			newGift.chocolateСandies = new СhocolateСandies(name, cost);
			return this;
		}

		public Builder withСookie(String name, int cost) {
			newGift.cookie = new Сookie(name, cost);
			return this;
		}

		public Builder withPackaging(String name, int cost) {
			newGift.packaging = new Packaging(name, cost);
			return this;
		}

		public Gift build() {			
			newGift.totalCost = (newGift.bar !=null ? newGift.bar.getCost() : 0) + 
								(newGift.lollipops!=null ? newGift.lollipops.getCost() : 0) + 
								(newGift.soda!= null ? newGift.soda.getCost() : 0) + 
								(newGift.chocolateСandies!= null ? newGift.chocolateСandies.getCost() : 0) + 
								(newGift.cookie != null ? newGift.cookie.getCost() : 0) + 
								(newGift.packaging != null ? newGift.packaging.getCost() : 0);
			return newGift;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bar == null) ? 0 : bar.hashCode());
		result = prime * result + ((chocolateСandies == null) ? 0 : chocolateСandies.hashCode());
		result = prime * result + ((cookie == null) ? 0 : cookie.hashCode());
		result = prime * result + ((lollipops == null) ? 0 : lollipops.hashCode());
		result = prime * result + ((packaging == null) ? 0 : packaging.hashCode());
		result = prime * result + ((soda == null) ? 0 : soda.hashCode());
		result = prime * result + totalCost;
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
		Gift other = (Gift) obj;
		if (bar == null) {
			if (other.bar != null)
				return false;
		} else if (!bar.equals(other.bar))
			return false;
		if (chocolateСandies == null) {
			if (other.chocolateСandies != null)
				return false;
		} else if (!chocolateСandies.equals(other.chocolateСandies))
			return false;
		if (cookie == null) {
			if (other.cookie != null)
				return false;
		} else if (!cookie.equals(other.cookie))
			return false;
		if (lollipops == null) {
			if (other.lollipops != null)
				return false;
		} else if (!lollipops.equals(other.lollipops))
			return false;
		if (packaging == null) {
			if (other.packaging != null)
				return false;
		} else if (!packaging.equals(other.packaging))
			return false;
		if (soda == null) {
			if (other.soda != null)
				return false;
		} else if (!soda.equals(other.soda))
			return false;
		if (totalCost != other.totalCost)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "# Gift \n" + (bar != null ? "Bar: " + bar : "") + (lollipops != null ? "Lollipops: " + lollipops : "")
				+ (soda != null ? "Soda: " + soda : "")
				+ (chocolateСandies != null ? "Chocolate candies: " + chocolateСandies : "")
				+ (cookie != null ? "Сookie: " + cookie : "") + (packaging != null ? packaging : "") + "\n"
				+ (totalCost != 0 ? "# Total cost: " + totalCost + " BYN \n" : 0);
	}

}
