package Exercicios.modulo16.exercicio09.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Exercicios.modulo16.exercicio09.entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = entrada.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username, moment));
				line = br.readLine();
			}
			
			System.out.println("Total users: " + set.size());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

			entrada.close();
		}
	}
}
