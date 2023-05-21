package Exercicios.modulo17.exercicio04.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Exercicios.modulo17.exercicio04.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//**** alguns exemplos abaixo precisam importar as classes*****
		
		//POSSIBILIDADES:
		//list.removeIf(p -> p.getPrice() >= 100); inline;
		//list.removeIf(new ProductPredicate()); classe productPredicate.
		//list.removeIf(Product::staticProductPredicate); método statico no Product.
		//list.removeIf(Product::nonStaticProductPredicate); método normal no Product.
		/*
		 Predicate<Product> pred = p -> p.getPrice() >= 100; instanciando predicate. Declarada.
		 list.removeIf(pred);
		*/
		
		Double min = 100.00;
		
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
