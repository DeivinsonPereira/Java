package Exercicios.modulo17.exercicio05.util;

import java.util.function.Consumer;

import Exercicios.modulo17.exercicio05.entities.Product;

public class MyConsumer implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	
}
