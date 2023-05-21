package Exercicios.modulo07;

public class Exercicio01Banco {

	private int conta;
	private String nome;
	private double saldo;

	public Exercicio01Banco(int conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public Exercicio01Banco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void saque(double saque) {
			this.saldo -= (saque + 5);
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public String toString() {
		return "Account " + this.conta + ", Holder: " + nome + ", Balance: $" + String.format("%.2f", saldo);
	}
	
}
