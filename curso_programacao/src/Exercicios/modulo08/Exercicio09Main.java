package Exercicios.modulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		
		System.out.print("Quantos alunos serão digitados? ");
		num = entrada.nextInt();
		
		String[] nomes = new String[num];
		double[] notas1 = new double[num];
		double[] notas2 = new double[num];
		
		for (int i = 0; i < num; i++) {
			entrada.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: %n", i +1);
			nomes[i] = entrada.nextLine();
			notas1[i] = entrada.nextDouble();
			notas2[i] = entrada.nextDouble();
			
		}
		
		double media = 0;
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < num; i++) {
			media = (notas1[i] + notas2[i]) / 2;
			if(media >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		
		
		entrada.close();
	}
}
