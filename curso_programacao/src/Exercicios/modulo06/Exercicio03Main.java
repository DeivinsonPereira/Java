package Exercicios.modulo06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Exercicio03Alunos a = new Exercicio03Alunos();
		System.out.print("Nome do Aluno: ");
		a.nome = entrada.nextLine();
		System.out.println("Digite as 3 Notas: ");
		a.nota01 = entrada.nextDouble();
		a.nota02 = entrada.nextDouble();
		a.nota03 = entrada.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", a.media());
		System.out.println(a.situacao());
		
		entrada.close();
	}
}
