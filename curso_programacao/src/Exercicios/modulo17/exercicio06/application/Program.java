package Exercicios.modulo17.exercicio06.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import Exercicios.modulo17.exercicio06.entities.Product;

public class Program {

	public static void main(String[] args) {
		
Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Function<Product, String> func = p -> p.getName().toUpperCase(); DECLARAÇÃO FUNCTION
		
		//FORMAS DE FAZER:
		
		//***Transforma em stream e depois em list novamente***
		//List<String> names = list.stream().map(new MyFunction()).collect(Collectors.toList()); //Utilizando outra classe MyFunction.
		//List<String> names = list.stream().map(Product::staticUpperCase).collect(Collectors.toList()); utilizando metodo static no Product
		//List<String> names = list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList()); utilizando metodo sem static no Product
		//List<String> names = list.stream().map(func).collect(Collectors.toList()); FORMA DECLARADA DA FUNCTION.
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());// FORMA INLINE.
		names.forEach(System.out::println);
	}
}
