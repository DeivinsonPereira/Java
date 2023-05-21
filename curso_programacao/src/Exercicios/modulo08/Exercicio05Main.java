package Exercicios.modulo08;

import java.util.Scanner;

public class Exercicio05Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantidade = entrada.nextInt();
		int[] vetorA = new int[quantidade];
		int[] vetorB = new int[quantidade];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA [i] = entrada.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB [i] = entrada.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println(vetorA[i] + vetorB[i]);
		}
		entrada.close();
	}
}
