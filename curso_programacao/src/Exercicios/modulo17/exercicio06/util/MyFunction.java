package Exercicios.modulo17.exercicio06.util;

import java.util.function.Function;

import Exercicios.modulo17.exercicio06.entities.Product;

public class MyFunction implements Function<Product, String> {

	//product entrada, string saida;
	
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}
