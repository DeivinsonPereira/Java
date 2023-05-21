package Exercicios.modulo17.exercicio04.util;

import java.util.function.Predicate;

import Exercicios.modulo17.exercicio04.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
