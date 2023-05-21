package Exercicios.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		double unitario, recebido, troco, total;
		int quantidade;
		System.out.print("Preço unitáro do produto: ");
		unitario = entrada.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = entrada.nextInt();
		System.out.print("Dinheiro recebido: ");
		recebido = entrada.nextDouble();
		
		total = unitario * quantidade;
		
		if(recebido >= total) {
			troco = recebido - total;
			System.out.printf("TROCO = R$%.2f",troco);
		}else{
			troco = (recebido - total) * -1;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$%.2f", troco);
		}
		
		
		
		
		entrada.close();
		
	}
}
