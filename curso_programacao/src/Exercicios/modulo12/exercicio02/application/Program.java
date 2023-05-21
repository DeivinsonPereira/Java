package Exercicios.modulo12.exercicio02.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo12.exercicio02.entities.Employee;
import Exercicios.modulo12.exercicio02.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = entrada.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("------------------");
			System.out.println();
			
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char yesNo = entrada.next().charAt(0);
			
			if(yesNo == 'n') {
				System.out.print("Name: ");
				entrada.nextLine();
				String name = entrada.nextLine();
				System.out.print("Hours: ");
				int hours = entrada.nextInt();
				System.out.print("Value per Hour: ");
				double valuePerHour = entrada.nextDouble();
				
				Employee employee = new Employee(name, hours, valuePerHour);
				
				list.add(employee);
				
			}else {
				System.out.print("Name: ");
				entrada.nextLine();
				String name = entrada.nextLine();
				System.out.print("Hours: ");
				int hours = entrada.nextInt();
				System.out.print("Value per Hour: ");
				double valuePerHour = entrada.nextDouble();
				System.out.print("Additional charge: ");
				double additionalCharge = entrada.nextDouble();
				
				Employee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				
				list.add(outsourcedEmployee);
			}
			
		}
		
		System.out.println("PAYMENTS:");
		
		System.out.println();
		
		for (Employee e : list) {
				System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
		}
		
		entrada.close();
	}
}
