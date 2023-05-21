package Exercicios.modulo08;

import java.util.Scanner;

public class Exercicio08Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int quant = entrada.nextInt();
		
		int[] idade = new int[quant];
		String[] nome = new String[quant];
		int maiorIdade = 0;
		int posicaoMaior;
		
		for (int i = 0; i < quant; i++) {
			System.out.println("Dados da " + (i +1) + "ª pessoa: ");
			System.out.print("Nome: ");
			nome[i] = entrada.next();
			System.out.print("Idade: ");
			idade[i] = entrada.nextInt();
		}	
			
		maiorIdade = idade[0];
		posicaoMaior = 0;
			for (int i = 1; i < quant; i++) {
				if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaior = i;
				}
			}
		System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaoMaior]);
		
		
		
		entrada.close();
	}
}
