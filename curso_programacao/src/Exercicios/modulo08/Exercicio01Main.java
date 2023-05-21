package Exercicios.modulo08;

import java.util.Scanner;

public class Exercicio01Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int quant = entrada.nextInt();
		int[] N = new int[quant];
		
		for (int i = 0; i < quant; i++) {
			entrada.nextLine();
			N[i] = entrada.nextInt();
		}
		System.out.println("NÚMEROS NEGATIVOS:");
		for (int i = 0; i < N.length; i++) {
			if(N[i] < 0) {
				System.out.println(N[i]);
			}
		}
		
		
		
		entrada.close();
		
	}
}
