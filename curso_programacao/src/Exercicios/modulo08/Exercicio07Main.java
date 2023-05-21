package Exercicios.modulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int q = entrada.nextInt();
		int[] vetor = new int[q];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = entrada.nextInt();
		}
		
		int soma = 0;
		int numPar = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				numPar ++;
			}
		}
		
		
		double mediaPar = (double) soma / numPar;
		if(numPar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else{
			System.out.printf("MEDIA DOS PARES = %.1f", mediaPar);
			
		}
		
		entrada.close();
	}
}
