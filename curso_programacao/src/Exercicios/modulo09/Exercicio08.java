package Exercicios.modulo09;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Qual a ordem da matriz? ");
		int n = entrada.nextInt();
		
		double[][] elemento = new double[n][n];
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		entrada.nextLine();
		double somaPositivo = 0;
		for (int i = 0; i < elemento.length; i++) {
			for (int j = 0; j < elemento[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				elemento[i][j] = entrada.nextDouble();
				if(elemento[i][j] > 0.0) {
					somaPositivo += elemento[i][j];
				}
			}
		}
		
		System.out.printf("\nSOMA DOS POSITIVOS: %.1f%n",somaPositivo);

		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		
		System.out.print("Escolha uma linha: ");
		int linha = entrada.nextInt();
		for (int i = linha; i <= linha; i++) {
			System.out.print("LINHA ESCOLHIDA: ");
			for (int j = 0; j < elemento[i].length; j++) {
				System.out.print(elemento[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.print("Escolha uma coluna: ");
		int coluna = entrada.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < elemento.length; i++) {
			for (int j = coluna; j <= coluna; j++) {
				System.out.print(elemento[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < elemento.length; i++) {
			for (int j = 0; j < elemento[i].length; j++) {
				if(i == j) {
					System.out.print(elemento[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA: ");
		for (int i = 0; i < elemento.length; i++) {
			for (int j = 0; j < elemento[i].length; j++) {
				if(elemento[i][j] < 0) {
					elemento[i][j] = Math.pow(elemento[i][j], 2);
				}
				System.out.print(elemento[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		
		entrada.close();
	}
}
