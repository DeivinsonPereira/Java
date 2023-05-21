package Exercicios.modulo11.Composicao.Exercicio03.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo11.Composicao.Exercicio03.entities.Client;
import Exercicios.modulo11.Composicao.Exercicio03.entities.Order;
import Exercicios.modulo11.Composicao.Exercicio03.entities.OrderItem;
import Exercicios.modulo11.Composicao.Exercicio03.entities.Product;
import Exercicios.modulo11.Composicao.Exercicio03.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String nameClient = entrada.nextLine();
		System.out.print("Email: ");
		String emailClient = entrada.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(entrada.next());

		Client client = new Client(nameClient, emailClient, birthDate);

		System.out.println();
		System.out.println("---------------");
		System.out.println();

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = entrada.next();
		System.out.println();
		Date date = new Date();
		Order order = new Order(date, OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order? ");
		int n = entrada.nextInt();
		
		System.out.println();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (1 + i) + " item data:");
			System.out.print("Product name: ");
			entrada.nextLine();
			String productName = entrada.nextLine();
			System.out.print("Product price: $");
			double productPrice = entrada.nextDouble();
			System.out.print("Quantity: ");
			int quantity = entrada.nextInt();
			
			OrderItem item = new OrderItem(quantity, productPrice, 
					new Product(productName, productPrice));
			order.addItem(item);
			
			System.out.println();
			System.out.println("----------------");
			System.out.println();
			
		}
		
		
		
		System.out.println(order);
		
		entrada.close();
	}
}
