package Exercicios.modulo12.exercicio06.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo12.exercicio06.entities.Company;
import Exercicios.modulo12.exercicio06.entities.Individual;
import Exercicios.modulo12.exercicio06.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = entrada.nextInt();

		System.out.println();
		System.out.println("---------------------");
		System.out.println();

		List<TaxPayer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char indOrComp = entrada.next().charAt(0);
			if (indOrComp == 'i') {
				System.out.print("Name: ");
				String name = entrada.next();
				System.out.print("Anual income: $");
				double anualIncome = entrada.nextDouble();
				System.out.print("Health expenditures: $");
				double healthExpenditures = entrada.nextDouble();

				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Name: ");
				String name = entrada.next();
				System.out.print("Anual income: $");
				double anualIncome = entrada.nextDouble();
				System.out.print("Number of Employees: ");
				int numberEmployees = entrada.nextInt();

				list.add(new Company(name, anualIncome, numberEmployees));
			}

			System.out.println();
			System.out.println("---------------------");
			System.out.println();
		}

		System.out.println("TAXES PAID:");

		System.out.println();
		for (TaxPayer tp : list) {
			System.out.printf("%s: $ %.2f%n", tp.getName(), tp.tax());
		}

		double sum = 0.0;

		for (TaxPayer tp : list) {
			sum += tp.tax();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);

		entrada.close();
	}
}
