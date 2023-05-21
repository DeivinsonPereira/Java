package Exercicios.modulo02;
import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome1, nome2;
		double idade1, idade2;
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = entrada.nextLine();
		System.out.print("Idade: ");
		idade1 = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		nome2 = entrada.nextLine();
		System.out.print("Idade: ");
		idade2 = entrada.nextInt();
		
		double media = (idade1 + idade2) / 2;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos.", nome1, nome2, media);
		
		
		
		entrada.close();
	}
}
