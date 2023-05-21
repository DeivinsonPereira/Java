package Exercicios.modulo16.exercicio01.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo16.exercicio01.services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = entrada.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = entrada.nextInt();
			ps.AddValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.First());
		
		entrada.close();
	}
}
