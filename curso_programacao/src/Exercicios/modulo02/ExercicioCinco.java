package Exercicios.modulo02;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Preço unitário do produto: R$");
		double unitario = entrada.nextDouble();
		System.out.print("Quantidade comprada: ");
		int quantidade = entrada.nextInt();
		System.out.print("Dinheiro recebido: R$");
		double dinheiro = entrada.nextDouble();
		
		double troco = dinheiro - unitario * quantidade;
		
		System.out.printf("TROCO: %.2f", troco);
		
		
		
		entrada.close();
	}
}
