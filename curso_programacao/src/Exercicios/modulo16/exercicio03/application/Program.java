package Exercicios.modulo16.exercicio03.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Object não é superTipo das demais classes de valores... o ? sim. 
		List<?> myObjs = new ArrayList<>();
		List<Integer> myNumbers = new ArrayList<>();
		myObjs = myNumbers;
		
		
		//object é superclasse das demais classes de valores;
		Object obj;
		Integer x = 10;
		obj = x;
	}
}
