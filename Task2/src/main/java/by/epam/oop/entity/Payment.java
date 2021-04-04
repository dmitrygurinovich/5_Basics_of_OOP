package by.epam.oop.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Payment {
	private ArrayList<Product> products = new ArrayList<>();
	private int totaltPrice;

	public Payment(Product... products) {
		int tempTotalPrice = 0;
		this.products = new ArrayList<>(Arrays.asList(products));
		for (Product product : products) {
			tempTotalPrice += product.getPrice();
		}
		this.setTotaltPrice(tempTotalPrice);
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public int getTotaltPrice() {
		return totaltPrice;
	}

	public void setTotaltPrice(int totaltPrice) {
		this.totaltPrice = totaltPrice;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		result = prime * result + totaltPrice;
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
		Payment other = (Payment) obj;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		if (totaltPrice != other.totaltPrice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment: " + products + "\nTotal price: " + totaltPrice + " BYN";
	}

	public class Product {
		private String name;
		private int price;

		public Product(String name, int price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
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
			Product other = (Product) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			return true;
		}
		
		private Payment getEnclosingInstance() {
			return Payment.this;
		}

		@Override
		public String toString() {
			return "product: " + name + ", price: " + price + " BYN";
		}

	}
}
