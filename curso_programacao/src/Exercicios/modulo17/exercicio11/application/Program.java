package Exercicios.modulo17.exercicio11.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Exercicios.modulo17.exercicio11.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = entrada.nextLine();


		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Employee> list = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			Double salary = entrada.nextDouble();
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
						
			List<String> email = list.stream()
					.filter(p -> p.getSalary() >= salary)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			System.out.println();
			System.out.println("-------------");
			System.out.println();
			email.forEach(System.out::println);
			
			Double sum = list.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println();
			System.out.println("-------------");
			System.out.println();
			System.out.println("Sum of salary of people whose name starts with 'M': $"+ String.format("%.2f",sum));

			List<String> name = list.stream()
					.filter(p -> p.getSalary() < salary)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			System.out.println();
			System.out.println("-------------");
			System.out.println();
			System.out.println("Funcionários em ordem decrescente que ganham menos de $" + String.format("%.2f: ", salary));
			
			System.out.println();
			name.forEach(System.out::println);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		entrada.close();
	}

}
