package Exercicios.modulo17.exercicio05.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Exercicios.modulo17.exercicio05.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.forEach(new MyConsumer()); chamando Classe MyConsumer.
		//list.forEach(Product::staticPriceUpdate); método static classe product.
		//list.forEach(Product::nonStaticPriceUpdate); método sem static classe product.
		/*
		 * Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1); expressçao lambda declarada.
		 * list.forEach(cons);
		 */
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));// inline.
		
		list.forEach(System.out::println);
	}
}
