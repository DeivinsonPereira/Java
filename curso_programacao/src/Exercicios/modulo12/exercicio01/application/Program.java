package Exercicios.modulo12.exercicio01.application;

import Exercicios.modulo12.exercicio01.entities.Account;
import Exercicios.modulo12.exercicio01.entities.BusinessAccount;
import Exercicios.modulo12.exercicio01.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		
		Account acc = new Account(1001, "Alex", 0.00);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0, 500.00);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0, 200);
		Account acc3 = new SavingsAccount(1004, "Ana", 0, 0.01);
		
		//DOWNCAST - nem sempre vai dar certo e o compilador nem sempre sabe disso...
		
		
		BusinessAccount acc4 = (BusinessAccount) /*casting forçado */acc2;
		acc4.loan(100.0);
		
		//down cast errado abaixo como comentário;
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		System.out.println(acc1.getHolder());
		System.out.println(acc.getBalance());
	}
}
