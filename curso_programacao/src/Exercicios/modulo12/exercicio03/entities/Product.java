package Exercicios.modulo12.exercicio03.entities;

public class Product {

	private String name;
	private double price;

	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public String priceTag() {
		return this.name + " $ " + String.format("%.2f",price);
	}
	
}
