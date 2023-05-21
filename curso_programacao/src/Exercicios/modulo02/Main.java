package Exercicios.modulo02;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		
		
		int idade = 32;
		String nome = "Maria";
		double salario = 4000.00;
		System.out.println(idade);
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println(nome + " tem" + idade + " anos e ganha R$" + salario);
		System.out.printf("%s tem %d anos e ganha R$ %.2f%n.", nome, idade, salario);
	}

}
