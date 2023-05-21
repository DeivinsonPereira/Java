package Exercicios.modulo08.treino;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Serão digitados quantos produtos? ");
		int n = entrada.nextInt();

		List<Produtos> produtos = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("\nNome do produto: ");
			entrada.nextLine();
			String nome = entrada.nextLine();
			System.out.print("Preço do produto: R$");
			Double preco = entrada.nextDouble();
			System.out.print("Quantidade de produtos vendidos: ");
			int quantidade = entrada.nextInt();

			System.out.println();
			System.out.println("---------------------");

			Produtos prod = new Produtos(nome, preco, quantidade);

			produtos.add(prod);

		}

		produtos.forEach(System.out::println);

		System.out.println();

		for (int i = 0; i < produtos.size(); i++) {
			System.out.print("Deseja dar desconto para " + produtos.get(i).getNome() + "? (s/n) ");
			char simNao = entrada.next().charAt(0);
			if (simNao != 'n') {
				System.out.print("Qual a porcentagem do desconto? ");
				int porcentagem = entrada.nextInt();
				produtos.get(i).desconto(porcentagem);
			}
		}

		System.out.println();

		produtos.forEach(System.out::println);

		entrada.close();
	}
}
