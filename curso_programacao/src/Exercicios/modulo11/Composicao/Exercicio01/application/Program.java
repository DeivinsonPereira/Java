package Exercicios.modulo11.Composicao.Exercicio01.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo11.Composicao.Exercicio01.entitites.Department;
import Exercicios.modulo11.Composicao.Exercicio01.entitites.HourContract;
import Exercicios.modulo11.Composicao.Exercicio01.entitites.Workers;
import Exercicios.modulo11.Composicao.Exercicio01.entitites.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = entrada.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = entrada.nextLine();
		System.out.print("Level: ");
		String workerLevel = entrada.nextLine();
		System.out.print("Base salary: ");
		double workerBaseSalary = entrada.nextDouble();
		
		Workers worker = new Workers(workerName, WorkerLevel.valueOf(workerLevel), 
				workerBaseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = entrada.nextInt();
		
		for(int i = 1; i<= n; i++) {
			System.out.println("Enter contract #" + i + "data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(entrada.next());
			System.out.print("Value per Hour: ");
			double valuePerHour = entrada.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = entrada.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = entrada.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		entrada.close();
		
	}

}
