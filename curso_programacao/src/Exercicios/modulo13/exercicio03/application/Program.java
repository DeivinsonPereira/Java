package Exercicios.modulo13.exercicio03.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Exercicios.modulo13.exercicio02.model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

			// Maneira muito ruim de fazer o programa e tratar o erro.

			Scanner entrada = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			System.out.print("Room number: ");
			int number = entrada.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(entrada.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(entrada.next());

			if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");

			} else {
				Reservation reservation = new Reservation(number, checkIn, checkOut);
				System.out.println("Reservation: " + reservation);

				System.out.println();
				System.out.println("Enter data to update the reservation");
				System.out.print("Room number: ");
				System.out.print("Check-in date (dd/MM/yyyy): ");
				checkIn = sdf.parse(entrada.next());
				System.out.print("Check-out date (dd/MM/yyyy): ");
				checkOut = sdf.parse(entrada.next());

				Date now = new Date();
				if (checkIn.before(now) || checkOut.before(now)) {
					System.out.println("Error in reservation: Reservation dates for update must be futured dates");

				} else if (!checkOut.after(checkIn)) {
					System.out.println("Error in reservation: Check-out date must be after check-in date");

				} else {
					reservation.updateDates(checkIn, checkOut);
					System.out.println("Reservation: " + reservation);
				}
			}
				
			
			entrada.close();
	}

}
