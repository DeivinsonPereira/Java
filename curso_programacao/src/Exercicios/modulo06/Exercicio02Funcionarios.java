package Exercicios.modulo06;

public class Exercicio02Funcionarios {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario (double porcentagem) {
		this.salarioBruto = salarioBruto + (salarioBruto * (porcentagem / 100));
	}
}
