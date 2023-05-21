package Exercicios.modulo15.exercicio03.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo15.exercicio03.model.entities.Contract;
import Exercicios.modulo15.exercicio03.model.entities.Installment;
import Exercicios.modulo15.exercicio03.model.services.ContractService;
import Exercicios.modulo15.exercicio03.model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner enter = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.println();
		System.out.print("Number: ");
		int number = enter.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(enter.next(), fmt);
		System.out.print("Contract value: $");
		double contractValue = enter.nextDouble();
		
		Contract contract = new Contract(number, date, contractValue);
		
		System.out.print("Enter number of installments: ");
		int month = enter.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, month);
		
		System.out.println();
		System.out.println("-------------");
		System.out.println();
		System.out.println("INSTALLMENTS: ");
		
		for (Installment installments : contract.getInstallment()) {
			System.out.println(installments);
		}
		
		
		enter.close();
		
	}
}
