package Exercicios.modulo13.exercicio04.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo13.exercicio04.entities.Account;
import Exercicios.modulo13.exercicio04.exception.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data:");
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		System.out.print("Number: ");
		int number = entrada.nextInt();
		System.out.print("Holder: ");
		entrada.nextLine();
		String name = entrada.nextLine();
		System.out.print("Initial Balance: ");
		double initialBalance = entrada.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = entrada.nextDouble();
		
		Account account = new Account(number, name, initialBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		account.withdraw(entrada.nextDouble());
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch(DomainException e) {
			System.out.println();
			System.out.println("---------------");
			System.out.println();
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		entrada.close();
	}
}
