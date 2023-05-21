package Exercicios.modulo08.treino;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Listas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		List<Cliente> cliente = new ArrayList<>();
		System.out.print("Lista de quantos clientes? ");
		Integer n = entrada.nextInt();
		Cliente comprador = null;
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();

			System.out.print("Codigo: ");
			Integer codigo = entrada.nextInt();

			System.out.print("Compra: ");
			Double compra = entrada.nextDouble();

			System.out.println();
			System.out.println("-----------------");
			System.out.println();

			comprador = new Cliente(nome, codigo, compra);

			cliente.add(comprador);
		}

		for (Cliente cliente2 : cliente) {
			System.out.print(cliente2.toString());
		}
		System.out.println();
		for (int i = 0; i < cliente.size(); i++) {
			System.out.print("Cliente " + cliente.get(i).getNome() + " comprou mais (y/n)? ");
			char decisao = entrada.next().charAt(0);
			
			if(decisao != 'n') {
				System.out.printf("Quanto ele comprou? ");
				Double quanto = entrada.nextDouble();
				cliente.get(i).comprarMais(quanto);
				System.out.println();
			}else {
				System.out.println();
			}
		}
		System.out.println();
		for (Cliente cliente2 : cliente) {
			System.out.print(cliente2.toString());
		}
		entrada.close();
	}
}
