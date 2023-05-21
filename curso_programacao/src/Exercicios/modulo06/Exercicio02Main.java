package Exercicios.modulo06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Exercicio02Funcionarios f = new Exercicio02Funcionarios();
		System.out.print("Nome: ");
		f.nome = entrada.nextLine();
		System.out.print("Salario bruto: ");
		f.salarioBruto = entrada.nextDouble();
		System.out.print("Imposto: ");
		f.imposto = entrada.nextDouble();
		
		System.out.printf("Funcionário: %s, $ %.2f%n", f.nome, f.salarioLiquido());
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		f.aumentarSalario(entrada.nextDouble());
		System.out.printf("Dados atualizados: %s, & %.2f",f.nome, f.salarioLiquido());
		
		
		
		
		
		entrada.close();
	}
}
