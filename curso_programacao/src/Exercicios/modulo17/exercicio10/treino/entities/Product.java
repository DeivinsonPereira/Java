package Exercicios.modulo17.exercicio10.treino.entities;

public class Product {
	//testeee
	private String name;
	private Double price;
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name + ", price: " + String.format("%.2f", getName());
	}
	
	
	
}
