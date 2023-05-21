package Exercicios.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int codigo, quantidade;
		double preco;

		System.out.print("Código do produto comprado: ");
		codigo = entrada.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidade = entrada.nextInt();

		if (codigo == 1) {
			preco = 5.00 * quantidade;
			System.out.printf("Valor a pagar: R$%.2f", preco);
		} else if (codigo == 2) {
			preco = 3.50 * quantidade;
			System.out.printf("Valor a pagar: R$%.2f", preco);
		} else if (codigo == 3) {
			preco = 4.80 * quantidade;
			System.out.printf("Valor a pagar: R$%.2f", preco);
		} else if (codigo == 4) {
			preco = 8.90 * quantidade;
			System.out.printf("Valor a pagar: R$%.2f", preco);
		} else if (codigo == 5) {
			preco = 7.32 * quantidade;
			System.out.printf("Valor a pagar: R$%.2f", preco);
		} else {
			System.out.println("Código Inválido");
		}

		entrada.close();
	}
}
