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
			tempTotalPrice+=product.getPrice();
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
	public String toString() {
		return "Payment: " + products +
				"\nTotal price: " + totaltPrice;
	}

	public class Product{
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
		public String toString() {
			return "product: " + name + ", price: " + price;
		}
		
	}
}
