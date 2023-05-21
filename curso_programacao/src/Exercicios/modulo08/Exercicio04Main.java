package Exercicios.modulo08;

import java.util.Scanner;

public class Exercicio04Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int num = entrada.nextInt();
		int[] numeros = new int[num];
		int quantpar = 0;
		for (int i = 0; i < numeros.length; i++) {
			entrada.nextLine();
			System.out.print("Digite um número: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.println("numeros pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0 ) {
				System.out.print(numeros[i] + " ");
				quantpar ++;
			}
		}
		
		System.out.println("\nQUANTIDADE DE PARES = " + quantpar);
		
		entrada.close();
	}
}
