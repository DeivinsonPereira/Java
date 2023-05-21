package Exercicios.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o salario da pessoa: ");
		double salario = entrada.nextDouble();
		
		if(salario <= 1000) {
			double salarioNovo = salario + (0.20 * salario);
			double aumento = salario * 0.20;
			System.out.printf("Novo salário = R$%.2f%n",salarioNovo);
			System.out.printf("Aumento = R$%.2f%n", aumento);
			System.out.println("porcentagem = 20%");
		}else if(salario <= 3000) {
			double salarioNovo = salario + (0.15 * salario);
			double aumento = salario * 0.15;			System.out.printf("Novo salário = R$%.2f%n",salarioNovo);
			System.out.printf("Aumento = R$%.2f%n", aumento);
			System.out.println("porcentagem = 15%");
		}else if(salario <= 8000) {
			double salarioNovo = salario + (0.10 * salario);
			double aumento = salario * 0.10;
			System.out.printf("Novo salário = R$%.2f%n",salarioNovo);
			System.out.printf("Aumento = R$%.2f%n", aumento);
			System.out.println("porcentagem = 10%");
		}else {
			double salarioNovo = salario + (0.05 * salario);
			double aumento = salario * 0.05;
			System.out.printf("Novo salário = R$%.2f%n",salarioNovo);
			System.out.printf("Aumento = R$%.2f%n", aumento);
			System.out.println("porcentagem = 5%");
		}
		
		
		entrada.close();
	}
}
