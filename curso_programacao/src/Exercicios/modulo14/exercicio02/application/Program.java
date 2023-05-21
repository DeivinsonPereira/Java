package Exercicios.modulo14.exercicio02.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		//esse programa é apenas para mostrar como abrir e fechar stream manualmente.
		String path = "C:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			// ou  br = new BufferedReader(new FileReader(path));
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
				
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		 
	}

}
