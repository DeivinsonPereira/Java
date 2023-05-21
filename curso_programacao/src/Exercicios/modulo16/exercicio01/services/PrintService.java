package Exercicios.modulo16.exercicio01.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list = new ArrayList<>();
	
	public void AddValue (T number) {
		list.add(number);
	}
	
	public T First() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print("," + list.get(i));
		}
		System.out.println("]");
		
		
	}
}
