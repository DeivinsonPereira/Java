package Exercicios.modulo16.exercicio06.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		//pode ser hashSet (não ordenado)
		//TreeSet (Ordem alfabetica)
		//LinkedHashSet (Ordem que foi colocado na lista.
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
