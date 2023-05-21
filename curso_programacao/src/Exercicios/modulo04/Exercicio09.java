package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int x, soma;
		System.out.print("Digite um numero inteiro: ");
		x = entrada.nextInt();
		while (x != 0) {
			if (x % 2 != 0) {
				x++;
			}
			soma = 5 * x + 20;
			System.out.printf("SOMA =  %d\n", soma);
			System.out.print("Digite um numero inteiro: ");
			x = entrada.nextInt();
		}

		entrada.close();
	}
}
