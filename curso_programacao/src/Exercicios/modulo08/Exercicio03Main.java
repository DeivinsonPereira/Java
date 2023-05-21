package Exercicios.modulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int numPessoas = entrada.nextInt();
		String[] nome = new String[numPessoas];
		int[] idade = new int[numPessoas];
		double[] altura = new double[numPessoas];
		double soma = 0;
		double altmedia = 0.0;
		int menor = 0;
		
		for (int i = 0; i < numPessoas; i++) {
			entrada.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
			System.out.print("Nome: ");
			nome[i] = entrada.nextLine();
			System.out.print("Idade: ");
			idade[i] = entrada.nextInt();
			entrada.nextLine();
			System.out.print("Altura: ");
			altura[i] = entrada.nextDouble();
			soma += altura[i];
		}
		
		altmedia = soma / numPessoas;
		
		for (int i = 0; i < numPessoas; i++) {
			if(idade[i] < 16) {
				menor ++;
			}
		}
		double abaixo = (double) menor / numPessoas * 100;
		
		
		System.out.printf("Altura média: %.2f%n", altmedia);
		System.out.print("Pesoas com menos de 16 anos: " + abaixo + "%\n");
		
			for (int i = 0; i < numPessoas; i++) {
				if(idade [i] < 16) {
				System.out.println(nome[i]);
				
			}
		}
		
		entrada.close();
	}

}
