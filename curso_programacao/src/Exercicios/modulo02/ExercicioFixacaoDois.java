package Exercicios.modulo02;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacaoDois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double largura, comprimento, valor;
		
		System.out.print("Digite a largura do terreno: ");
		largura = entrada.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = entrada.nextDouble();
		System.out.print("Digite o valor do metro quadrado: R$");
		valor = entrada.nextDouble();

		double area, preco;

		area = largura * comprimento;
		preco = valor * area;

		System.out.printf("Area do terreno = R$%.2f%n" , area);
		System.out.printf("Preço do Terreno = R$%.2f%n" , preco);

		entrada.close();
		
		
	}
}
