package Exercicios.modulo02;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		System.out.print("Valor por hora: R$");
		double valorhora = entrada.nextDouble();
		System.out.print("Horas Trabalhadas: ");
		int horastrab = entrada.nextInt();
		
		var pagamento = valorhora * horastrab;
		
		System.out.printf("O pagamento para %s deve ser %.2f", nome, pagamento);
		
		
		
		entrada.close();
	}
}
