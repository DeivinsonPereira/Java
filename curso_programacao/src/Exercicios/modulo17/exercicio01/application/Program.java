package Exercicios.modulo17.exercicio01.application;

import java.util.ArrayList;
import java.util.List;

import Exercicios.modulo17.exercicio01.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		// abaixo é uma das formas de fazer sem lambda;
		//CLASEE SEPARADA
				//list.sort(new MyComparator());
		
		
		//Outra forma de fazer só que fica verbosa.
		//CLASSE ANÔNIMA
		/*Comparator<Product> comp = new Comparator<>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};*/
		
		
		//Lambda com chaves:
		/*Comparator<Product> comp = (p1,p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};*/
		
		
		//Lambda sem chaves:
		//Comparator<Product> comp = (p1,p2) ->p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		
		// outra forma de fazer o lambda direto no argumento: 
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		
		
		//list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
