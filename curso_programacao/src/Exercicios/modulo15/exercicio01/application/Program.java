package Exercicios.modulo15.exercicio01.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo15.exercicio01.model.entities.CarRental;
import Exercicios.modulo15.exercicio01.model.entities.Vehicle;
import Exercicios.modulo15.exercicio01.model.services.BrazilTaxService;
import Exercicios.modulo15.exercicio01.model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		//Exercicio feito sem interface... dificulta muito na manutenção.
		//exercicio 2 é feito com interface.
		
		Locale.setDefault(Locale.US);
		Scanner entry = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental data");
		System.out.println();
		System.out.print("Car model: ");
		String carModel = entry.nextLine();
		System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(entry.nextLine(), fmt);
		System.out.print("Return (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(entry.nextLine(), fmt);

		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour: $");
		double pricePerHour = entry.nextDouble();
		System.out.print("Enter price per day: $");
		double pricePerDay = entry.nextDouble();

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(carRental);

		System.out.println();
		System.out.println("-------------");
		System.out.println();

		System.out.println("INVOICE: ");
		System.out.println();
		System.out.println("Basic payment: " + String.format("$%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("$%.2f", carRental.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("$%.2f", carRental.getInvoice().getTotalPayment()));

		entry.close();
	}
}
