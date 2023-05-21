package Exercicios.modulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas?");
		int n = entrada.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		
		for (int i = 0; i < n; i++) {
			entrada.nextLine();
			System.out.printf("Altura da %dª pessoa: ", i+1);
			altura[i] = entrada.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", i+1);
			genero[i] = entrada.next().charAt(0);
			
		}
		
		double menor = 0;
		double maior = 0;
		
		
		for (int i = 0; i < n; i++) {
			if(altura[i] < menor || menor == 0) {
				menor = altura[i];
			}
			if(altura[i] > maior) {
				maior = altura[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n",menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		
		double somaF = 0;
		int f = 0;
		int numM = 0;
		
		for (int i = 0; i < n; i++) {
			if(genero[i] == 'F') {
				somaF += altura[i];
				f++;
			}
		}
		
		double medF = somaF / f;
		System.out.printf("Media das alturas das mulheres: %.2f%n", medF);
		
		
		for (int i = 0; i < n; i++) {
			if(genero[i] == 'M') {
				numM++;
			}
		}
		
		System.out.println("Numero de Homens: " + numM);
		entrada.close();
	}
}
