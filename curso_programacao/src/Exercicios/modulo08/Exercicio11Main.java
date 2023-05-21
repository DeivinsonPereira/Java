package Exercicios.modulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Serão digitados dados de quantos produtos?");
		int quantidade = entrada.nextInt();
		String[] Nome = new String[quantidade];
		double[] precoCompra = new double[quantidade];
		double[] precoVenda = new double[quantidade];
		
		
		
		
		for (int i = 0; i < quantidade; i++) {
			entrada.nextLine();
			System.out.println("Produto " + (i +1) +":");
			System.out.print("Nome: ");
			Nome[i] = entrada.next();
			System.out.print("Preço de compra: ");
			precoCompra[i] = entrada.nextDouble();
			System.out.print("Preço de venda: ");
			precoVenda[i] = entrada.nextDouble();
		}
		
		double[] porcentagem = new double[quantidade] ;
		
		
		for (int i = 0; i < quantidade; i++) {
			porcentagem[i] = (precoVenda[i] - precoCompra[i]) / precoCompra[i] *100;
		}
		
		System.out.println("\nRELATORIO:");
		int menor = 0;
		int	meio = 0;
		int maior = 0;
		
		for (int i = 0; i < quantidade; i++) {
			if(porcentagem[i] < 10.0) {
				menor++;
			}else if(porcentagem[i] < 20.0) {
				meio++;
			}else {
				maior++;
			}
		}
		System.out.print("Lucro abaixo de 10%: " + menor);
		System.out.print("\nLucro entre 10% e 20%: " + meio);
		System.out.println("\nLucro acima de 20%: " + maior);
		
		double totCompra = 0;
		double totVenda = 0;
		
		for (int i = 0; i < quantidade; i++) {
			totCompra += precoCompra[i];
			totVenda += precoVenda[i];
		}
		
		System.out.printf("Valor total de compra: %.2f%n", totCompra);
		System.out.printf("Valor total de venda: %.2f%n", totVenda);
		
		double lucroTotal = totVenda - totCompra;
		
		System.out.printf("Lucro total: %.2f", lucroTotal);
		entrada.close();
	}
}
