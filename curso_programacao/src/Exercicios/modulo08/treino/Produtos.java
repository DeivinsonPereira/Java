package Exercicios.modulo08.treino;

public class Produtos {

	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Produtos(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco * quantidade;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public void desconto (double porcentagem) {
		preco -= preco * porcentagem / 100;
	}

	@Override
	public String toString() {
		return nome + ", " + String.format("$%.2f", preco);
	}
	
	
	
}
