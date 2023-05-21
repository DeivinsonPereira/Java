package Exercicios.modulo16.exercicio10.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Set<Integer> inteiros = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int a = entrada.nextInt();
		for (int i = 0; i < a; i++) {
			inteiros.add(entrada.nextInt());
		}

		System.out.print("How many students for course B? ");
		int b = entrada.nextInt();
		for (int i = 0; i < b; i++) {
			inteiros.add(entrada.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		int c = entrada.nextInt();
		for (int i = 0; i < c; i++) {
			inteiros.add(entrada.nextInt());
		}
		
		System.out.println("Total students: " + inteiros.size());
		
		entrada.close();

	}
}
