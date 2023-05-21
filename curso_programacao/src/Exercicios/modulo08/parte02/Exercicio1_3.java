package Exercicios.modulo08.parte02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("How many employees will be registred? ");
		int n = entrada.nextInt();
		System.out.println();
		List<Employee2> list = new ArrayList<>();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = entrada.nextInt();
			System.out.print("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.print("Salary: ");
			double salary = entrada.nextDouble();
			
			Employee2 emp = new Employee2(id, name, salary);
			
			list.add(emp);
			
		}
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = entrada.nextInt();
		Integer pos = position(list, idSalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage");
			
		}
		
		
		
		
		for (Employee2 employee2 : list) {
			System.out.println(employee2.toString());
		}
		
		
		
		
		entrada.close();
	}
	public static Integer position(List<Employee2> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
