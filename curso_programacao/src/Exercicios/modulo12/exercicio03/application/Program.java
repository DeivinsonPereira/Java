package Exercicios.modulo12.exercicio03.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo12.exercicio03.entities.ImportedProduct;
import Exercicios.modulo12.exercicio03.entities.Product;
import Exercicios.modulo12.exercicio03.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Enter the number of proucts: ");
		int n = entrada.nextInt();
		
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		
		List<Product> list = new ArrayList<>();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char cui = entrada.next().charAt(0);
			if(cui == 'i') {
				System.out.print("Name: ");
				String name = entrada.next();
				System.out.print("Price: $");
				double price = entrada.nextDouble();
				System.out.print("Customs fee: $");
				double customsFee = entrada.nextDouble();
				
				Product importedProduct = new ImportedProduct(name, price, customsFee);
				list.add(importedProduct);
			}else if(cui == 'c') {
				System.out.print("Name: ");
				String name = entrada.next();
				System.out.print("Price: $");
				double price = entrada.nextDouble();
				
				Product commonProduct = new Product(name, price);
				list.add(commonProduct);
			}else {
				System.out.print("Name: ");
				String name = entrada.next();
				System.out.print("Price: $");
				double price = entrada.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(entrada.next());
				
				Product usedProduct = new UsedProduct(name, price, date);
				list.add(usedProduct);
			}
			System.out.println();
			System.out.println("----------------");
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		
		System.out.println("PRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		entrada.close();
	}
}
