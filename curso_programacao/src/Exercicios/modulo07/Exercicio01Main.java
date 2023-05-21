package Exercicios.modulo07;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Exercicio01Banco resultado = null;
		
		System.out.print("Enter account number: ");
		int auxConta = entrada.nextInt();
		System.out.print("Enter account holder: ");
		entrada.nextLine();
		String auxNome = entrada.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char simNao = entrada.next().charAt(0);
		
		
		if(simNao == 'y') {
			System.out.print("Enter initial deposit value: ");
			double auxDepositoInicial = entrada.nextDouble();
			resultado = new Exercicio01Banco(auxConta, auxNome, auxDepositoInicial);
			
		}else {
			resultado = new Exercicio01Banco(auxConta, auxNome);
			
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(resultado);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		resultado.deposito(entrada.nextDouble());
		System.out.println("Updated Account data: ");
		System.out.println(resultado);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		resultado.saque(entrada.nextDouble());
		System.out.println("Updated Account data: ");
		System.out.println(resultado);
		
		
		
		
		
		
		
		
		entrada.close();
	}
}
